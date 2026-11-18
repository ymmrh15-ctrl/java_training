//要復習
package chap_9;

public class P346_Main {
	//HPを10回復する
	public static void heal(int hp) {
		hp += 10;
	}
	//ThiefのHPを10回復する
	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		//baseHpを定義
		int baseHp = 25;
		//Thiefインスタンスを生成
		Thief t = new Thief("アサカ", baseHp);
		
		
		heal(baseHp);
		//Thiefのhpが呼び出されるから25
		System.out.println(baseHp + " : " + t.hp);
		
		heal(t);//アサカさんのthiefに渡す
		System.out.println(baseHp + " : " + t.hp);
	}

}
