package chap_12;

public class Thief extends Character{
	public Thief() {
		super("盗賊", 100);
	}
	
	public void attack(Monster m) {
	System.out.println(this.name + "の攻撃!");
	System.out.println("敵に3ぽイントのダメージ");
	m.hp -= 3;
	}
	}
