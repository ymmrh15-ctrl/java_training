package chap_4;

public class P170_1Main {

	public static void main(String[] args) {
		//練習4-1
		@SuppressWarnings("unused")
		int[] points = new int[4];
		@SuppressWarnings("unused")
		double[] weights = new double[5];
		@SuppressWarnings("unused")
		boolean[] answers = new boolean[3];
		@SuppressWarnings("unused")
		String[] names = new String[3];
		//練習4-2
		int[] moneyList = { 121902, 8302, 55100 };
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int value : moneyList) {
			System.out.println(value);
		}
		//練習4-3
		//		NullPointerException
		//		ArrayIndexOutOfBoundsException
		//練習4-4
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		@SuppressWarnings("resource")
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (value == input) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("はずれ");
				break;
			}

		}
	}

}
