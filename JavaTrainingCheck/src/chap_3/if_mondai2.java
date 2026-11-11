package chap_3;

/********************************
 * 概要：年齢によって入場料を判別するプログラム
 * 
 * 入場料については以下のとおりとする。
 * 
 * 4歳未満				：無料
 * 4歳以上～13歳未満			：子供料金
 * 13歳以上				：大人料金
 * 
 ********************************/
public class if_mondai2 {

	public static void main(String[] args) {
		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		if (age < 4) {
			System.out.println("無料");
		} else if ((age >= 4) && (age < 13)){
			System.out.println("子供料金");
		} else {
			System.out.println("大人料金");
		}
	}

}

