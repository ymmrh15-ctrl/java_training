package chap_4;

public class Janken {

	public static void main(String[] args) {
		System.out.println("手を入力してください[1:グー 2:チョキ 3:パー]");
		//定義
		int te = new java.util.Scanner(System.in).nextInt();
		int te2 = new java.util.Random().nextInt(3) + 1;
		
		//条件分岐
		if ( te ==  te2 ) {
			System.out.println("あいこです");
		}
		else if (te ==  ) {
			System.out.println();
		} else if (te ==  ) {
			System.out.println();
		}
	}

}