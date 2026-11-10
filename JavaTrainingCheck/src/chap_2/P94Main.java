package chap_2;

public class P94Main {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		//文字の入力の要求
		@SuppressWarnings("resource")//なんかあとで学ぶらしい!!!
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		//数字の入力の要求
		@SuppressWarnings("resource")//おーい元気だったかい！！！
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println(
				"ようこそ、" + age + "歳の" + name + "さん");
	}
}