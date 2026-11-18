package chap_9;

public class Main {

	public static void main(String[] args) {
		//Swordインスタンス
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		//Heroインスタンス
		Hero h = new Hero("ミナト");
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;//swordフィールドに生成済みの剣インスタンス
		
		System.out.println("現在の武器は" + h.sword.name);//勇者の剣の名前
		h.attack();
	}
		

}
