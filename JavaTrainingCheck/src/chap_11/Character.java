package chap_11;


//抽象クラス 継承されることが前提
//継承しないと使えない、継承されるためだけのクラス
//newによるインスタンス化が禁止されている
public abstract class Character {
	//フィールド
	String name;
	int hp = 100;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//抽象メソッド
	//現時点では何をするか確定できないメソッド
	public abstract void attack(Matango m);
	


}
