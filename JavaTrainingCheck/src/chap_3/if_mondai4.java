package chap_3;

/******************************
 * 概要：サイコロを振り、出た目によっておみくじの結果を出力するプログラム
 * 
 * サイコロの出目および、おみくじの結果は以下のとおりとする。
 * 
 * サイコロの目
 * 	1	→	凶
 * 	2	→	末吉
 * 	3	→	小吉
 * 	4	→	中吉
 * 	5	→	中吉
 * 	6	→	大吉
 * 
 * 備考：乱数はRandomクラスを用いて生成すること
 * 
 * ****************************/
public class if_mondai4 {

	public static void main(String[] args) {
		int m =  new java.util.Random().nextInt(6) + 1;
		System.out.println(m);
		switch(m) {
		case 1 -> {
			System.out.println("凶");
		}case 2 -> {
			System.out.println("末吉");
		}case 3 -> {
			System.out.println("小吉");
		}case 4, 5 -> {
			System.out.println("中吉");
		}case 6 -> {
			System.out.println("大吉");
		}
		}
		
	}

}
