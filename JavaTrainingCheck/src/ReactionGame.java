
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ReactionGame extends JFrame {

    private JPanel panel;
    private JButton button;
    private JLabel message;
    private JLabel scoreLabel;

    private Timer timer;
    private Random random = new Random();

    private long startTime;

    private int highScore = 0;

    private boolean waiting = false;
    private boolean ready = false;

    public ReactionGame() {

        setTitle("反射神経ゲーム");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.RED);

        message = new JLabel(
            "1回勝負！準備はいい？",
            SwingConstants.CENTER
        );

        message.setFont(new Font("SansSerif", Font.BOLD, 25));
        message.setForeground(Color.WHITE);

        button = new JButton("スタート");
        button.setFont(new Font("SansSerif", Font.BOLD, 22));

        scoreLabel = new JLabel(
            "スコア：0点  最高記録：0点",
            SwingConstants.CENTER
        );

        scoreLabel.setFont(new Font("SansSerif", Font.BOLD, 18));

        panel.add(message, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        add(scoreLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        button.addActionListener(e -> play());

        setVisible(true);
    }

    private void play() {

        // 緑色になったらクリック
        if (ready) {

            long reactionTime =
                System.currentTimeMillis() - startTime;

            int score = calculateScore(reactionTime);

            if (score > highScore) {
                highScore = score;
            }

            ready = false;

            panel.setBackground(Color.BLUE);

            message.setText(
                reactionTime + "ms！ " + score + "点！"
            );

            scoreLabel.setText(
                "今回のスコア：" + score +
                "点  最高記録：" + highScore + "点"
            );

            button.setText("もう一度遊ぶ");

            return;
        }

        // フライング
        if (waiting) {

            timer.stop();
            waiting = false;

            panel.setBackground(Color.ORANGE);

            message.setText("フライング！ 0点！");
            button.setText("もう一度遊ぶ");

            return;
        }

        // ゲーム開始
        message.setText("緑色になるまで待って！");
        panel.setBackground(Color.RED);

        button.setText("待機中...");
        waiting = true;

        int delay = 2000 + random.nextInt(4000);

        timer = new Timer(delay, e -> {

            panel.setBackground(Color.GREEN);

            message.setText("今だ！！クリック！");
            button.setText("クリック！");

            startTime = System.currentTimeMillis();

            waiting = false;
            ready = true;
        });

        timer.setRepeats(false);
        timer.start();
    }

    private int calculateScore(long time) {

        if (time <= 100) return 1000;
        if (time <= 150) return 900;
        if (time <= 200) return 800;
        if (time <= 250) return 700;
        if (time <= 300) return 600;
        if (time <= 400) return 400;
        if (time <= 500) return 200;

        return 100;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new ReactionGame();
        });
    }
}
