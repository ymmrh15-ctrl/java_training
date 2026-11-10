package chap_4;

public class P148Main {

	public static void main(String[] args) {
		int scores[] = { 20, 30, 40, 50, 80 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}
}
