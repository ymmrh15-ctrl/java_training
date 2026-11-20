package chap_12;


public class Matango extends Monster{
	//フィールド
	public int hp;//HPの宣言
	final int LEVEL = 10;//レベルの宣言
	char suffix;//suffixは末尾
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}