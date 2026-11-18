package chap_9;

public class P326_Main {

	public static void main(String[] args) {
		//Heroインスタンスを作る
		Hero h1 = new Hero(null);
		h1.name = "ミナト";
		h1.hp = 100;
		
		//Heroインスタンスを作る
	    Hero h2 = new Hero(null);
	    h2.name = "アサカ";
	    h2.hp = 100;
	    
	    //Wizardインスタンスを作る
	    Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		//メソッド操作をする
		w.heal(h1);
		w.heal(h2);  
		w.heal(h2);
		}

}
