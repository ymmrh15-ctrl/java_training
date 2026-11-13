package calcapp.main;

import calcapp.logics.CalcLogic;
//import　パッケージ名.クラス名;

public class Calc {

	public static void main(String[] args) {
	//public どこからでも呼び出せる
	//static インスタンスを生成しなくても実行できる
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);//～パッケージの～クラスの～メソッド
		int delta = CalcLogic.hiku(a, b);
		//FQCN パッケージ名.クラス名
		System.out.println("足すと" + total + "、引くと" + delta);
	}     

}