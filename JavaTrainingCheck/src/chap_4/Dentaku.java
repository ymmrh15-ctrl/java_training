package chap_4;

public class Dentaku {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		int m = new java.util.Scanner(System.in).nextInt();
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("たす、ひく、かける、わるを選んでください");
		String a = new java.util.Scanner(System.in).nextLine();
		
		if (a.equals("+")) {
			System.out.println(m + n);
		} else if (a.equals("-")) {
			System.out.println(m - n);
		} else if (a.equals("*")) {
			System.out.println(m * n);
		} else if (a.equals("/")) {
			System.out.println(m / n);
		}
	}

}
