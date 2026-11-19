package chap_11;

import chap_10.Hero;

public class Matango {

	int hp = 50;
	char suffix;
	
	//文字ひとつ受け取る
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp += 10;
	}
}
