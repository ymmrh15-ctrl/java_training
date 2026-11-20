package chap_12;

public class Hero extends Character {

	//親クラスのコンストラクタを呼び出す
	//インスタンスを作ると自動的に実行される特別な処理
	public Hero() {
		super("勇者", 100);
	}

	public void attack(Monster m) {

		if (m instanceof Slime) {//mの中身がSlimeなら
			System.out.println(this.name + "の攻撃！");
			System.out.println("敵に20のダメージをあたえた！");
			m.hp -= 20;
		} else {
			System.out.println(this.name + "の攻撃！");
			System.out.println("敵に10のダメージをあたえた！");
			m.hp -= 10;
		}
	}
}
