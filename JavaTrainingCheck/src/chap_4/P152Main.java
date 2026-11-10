package chap_4;

public class P152Main {

	public static void main(String[] args) {
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = 0;
		int count = 0;//forに行くと外れるから
		for (int i = 0; i < scores.length; i++) {
			if (i % 2 == 0) {
				sum += scores[i];
				count++;
			}
		}
		int avg = sum / count;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}
}
