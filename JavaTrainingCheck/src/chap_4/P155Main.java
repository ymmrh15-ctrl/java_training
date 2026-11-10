package chap_4;

public class P155Main {

	public static void main(String[] args) {
		int seq[] = new int[10];

		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			//2行に簡略する
			char[] base = { 'A', 'T', 'G', 'C' };
			System.out.print(base[seq[i]] + " ");
		}
	}
}
