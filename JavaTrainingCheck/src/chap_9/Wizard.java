package chap_9;

public class Wizard {
	String name;
	int hp = 10;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
		System.out.println(h.name + "の現在のHPは" + h.hp + "です");
		System.out.println("");
	}

}
