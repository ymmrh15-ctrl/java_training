package chap_11;

public class Main {

	public static void main(String[] args) {
		//Dancerインスタンスを生み出す
		Dancer d = new Dancer();
		//Dancerフィールド
		d.name = "ダンサー";
		
		//Matagoインスタンスを生成
		Matango m = new Matango('A');
		
		//攻撃メソッドを実行
		d.attack(m);
		
		//ダンスメソッドを実行
		d.dance();
		
	}

}
