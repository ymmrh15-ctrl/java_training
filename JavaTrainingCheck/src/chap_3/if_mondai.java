package chap_3;

/********************************
 * 概要：20歳以上かどうかを判別するプログラム
 * 
 * 20歳以上なら「20歳以上」と、
 * 20歳未満なら「20歳未満」と出力する。
 * 
 ********************************/
public class if_mondai {

	public static void main(String[] args) {
		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		if (age >= 20) {
			System.out.println("20歳以上");
		} else {
			System.out.println("20歳未満");
		}
}
}
