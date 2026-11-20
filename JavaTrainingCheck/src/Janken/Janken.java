package Janken;

public class Janken {

	public static void main(String[] args) {
		
		int n = 3;
		int kati = 0;
		int make = 0;
		String hands[] = { "グー", "チョキ", "パー" };

		System.out.println("じゃんけん3回勝負");
		for (int i = 0; i < 3; i++) {
			System.out.println("手を入力してください[0:グー 1:チョキ 2:パー]");
			//定義
			int me = new java.util.Scanner(System.in).nextInt();
			int you = new java.util.Random().nextInt(3);

			System.out.println("自分の手は" + hands[me]);
			//条件分岐
			if (me == you) {
				System.out.println("相手の手は" + hands[you] + "です");
				System.out.println("あいこです");
			} else if (me == 0 && you == 1) {
				System.out.println("相手の手はチョキです");
				System.out.println("勝ち");
				kati++;
			} else if (me == 0 && you == 2) {
				System.out.println("相手の手はパーです");
				System.out.println("負け");
				make++;
			} else if (me == 1 && you == 0) {
				System.out.println("相手の手はグーです");
				System.out.println("負け");
				make++;
			} else if (me == 1 && you == 2) {
				System.out.println("相手の手はパーです");
				System.out.println("勝ち");
				kati++;
			} else if (me == 2 && you == 0) {
				System.out.println("相手の手はグーです");
				System.out.println("勝ち");
				kati++;
			} else if (me == 2 && you == 1) {
				System.out.println("相手の手はチョキです");
				System.out.println("負け");
				make++;
			}
			n--;
			if (n > 0) {

				System.out.println("残り" + n + "回です");
			}

		}
		System.out.println(kati + "回勝利し、" + make + "回負けました");
		System.out.println("終了します");

	}
}
