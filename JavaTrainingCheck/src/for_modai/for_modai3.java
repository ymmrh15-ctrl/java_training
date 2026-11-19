/***************************
 * 概要：＊を◤になるように出力するプログラム
 * 
 * 出力結果(参考)：
 
＊＊＊＊＊＊＊＊＊
＊＊＊＊＊＊＊＊
＊＊＊＊＊＊＊
＊＊＊＊＊＊
＊＊＊＊＊
＊＊＊＊
＊＊＊
＊＊
＊

 
 ***************************/
//これ自力で考えられない


package for_modai;

public class for_modai3 {

	public static void main(String[] args) {
	for (int i = 9; i > 0; i--) {//9行表示したいから9回繰り返す
		for (int j = 0; j < i ; j++) {//1行目に9個、2行目に8個・・・
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
