package chap_12;



public class Wizard extends Character {
	int mp;
	
	public Wizard() {
		super("魔法使い", 100);
	}

	//攻撃            
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に3ぽイントのダメージ");
		m.hp -= 3;
	}

	//ファイアーボール
	public void fireball(Monster m) {
		System.out.println(this.name + "の火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}

}
