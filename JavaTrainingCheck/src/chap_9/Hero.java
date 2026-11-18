package chap_9;

public class Hero {
	//変数宣言
	String mahou;
	String name;
	int hp;
	Sword sword;//Swordクラスをフィールドとして持たせた
		//アタックメソッドを作る
		public void attack() {
			//武器で攻撃したを加えた
			System.out.println(this.name + "は" + this.sword.name +"で攻撃した！");
			System.out.println("敵に" +  this.sword.damage + "のダメージをあたえた！");
		}
		
//	//コンストラクタを生成
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	//オーバーロードしてコンストラクタを2つ作る
	public Hero() {
		this("ダミー");//同じクラスにある別のコンストラクタを呼び出す
	}

}
