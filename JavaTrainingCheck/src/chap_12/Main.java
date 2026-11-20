package chap_12;


public class Main {

	public static void main(String[] args) {
		
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		for (Monster m : monsters) {
			m.run();
		}

//		Character[] c = new Character[5];
//		c[0] = new Hero();
//		c[1] = new Hero();
//		c[2] = new Thief();
//		c[3] = new Wizard();
//		c[4] = new Wizard();
//
//		for (Character ch : c) {
//			ch.hp += 50;
//			System.out.println(ch.name + "のHP"+ ch.hp);
//		}
//		Hero h = new Hero();
//		Slime s = new Slime();
//		Matango m = new Matango();
//		
//		h.attack(s);
//		h.attack(m);
		

		//		Character c = new Wizard();
		//		if(c instanceof Wizard w) {
		//			w.fireball(null);
		//		}

		//		//インスタンス
		//		Wizard w = new Wizard();
		//		Matango m = new Matango();
		//		Life lf = new Wizard();
		//		Character c = w;
		//		
		//		Slime s = new Slime();
		//		Monster m = new Slime();
		//		
		//		s.run(); 
		//		m.run();
		//		
		//		c.name = "アサカ";
		//		c.attack(m);
		////		c.firewall(m);
		//		
		//		w.name = "アサカ";
		//		w.attack(m);
		//		w.fireball(m);

	}

}
