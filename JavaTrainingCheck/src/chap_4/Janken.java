package chap_4;

public class Janken {

	public static void main(String[] args) {
		System.out.println("手を入力してください[1:グー 2:チョキ 3:パー]");
		//定義
		int te = new java.util.Scanner(System.in).nextInt();
		int te2 = new java.util.Random().nextInt(3) + 1;
		
		//条件分岐
		System.out.println(te2);
		if ( te ==  te2 ) {
			System.out.println("あいこです");
		}
		else if (te == 1 && te2 == 2) {
			System.out.println("勝ち");
		} else if (te == 1 && te2 == 3 ) {
			System.out.println("負け");
		} else if (te == 2 && te2 == 1) {
			System.out.println("負け");
		} else if (te == 2 && te2 == 3) {
			System.out.println("勝ち");
		} else if (te == 3 && te2 == 1) {
			System.out.println("勝ち");
		} else if (te == 3 && te == 2) {
			System.out.println("負け");
		}
	}

}