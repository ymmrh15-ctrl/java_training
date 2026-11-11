package chap_3;
/*******************************
 * 概要：月を入れたら季節を判別するプログラム
 * 
 * 季節の定義は以下のとおりとする
 * 春		：3月 ～5月
 * 夏		：6月 ～8月
 * 秋		：9月 ～11月
 * 冬		：12月～2月
 *******************************/

public class if_mondai3 {

	public static void main(String[] args) {
		System.out.println("月を入力してください");
		int month = new java.util.Scanner(System.in).nextInt();
		if (month >= 3 && month <= 5) {
			System.out.println("春");
		} else if (month >= 6 && month <= 8) {
			System.out.println("夏");
		} else if (month >= 9 && month <= 11) {
			System.out.println("秋");
		} else if ((month == 12) || (month == 1) ||  (month == 2)) {
			System.out.println("冬");
		}
	
}
}