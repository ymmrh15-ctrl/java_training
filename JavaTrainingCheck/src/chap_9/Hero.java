package chap_9;

public class Hero {
	//変数宣言
	String name;
	int hp;
	Sword sword;//Swordクラスをフィールドとして持たせた
	//アタックメソッドを作る
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

}
