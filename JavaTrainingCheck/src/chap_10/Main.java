package chap_10;

public class Main {

	public static void main(String[] args) {
		//Heroインスタンス
		Hero h = new Hero();
		h.run();
		//SuperHeroインスタンス
		SuperHero sh = new SuperHero();
		sh.run();
		
		//Weponインスタンス
		Weapon w = new Weapon();
		System.out.println(w.name + "の価格は" + w.price);
		
		PoisonMatango pm = new PoisonMatango('A');
		
		pm.attack(h);
		pm.attack(h);
	
	}

}