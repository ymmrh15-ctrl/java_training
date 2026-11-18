//要復習
package chap_10;

public class PoisonMatango extends Matango {

	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);//親クラスであるMatangoのコンストラクタを呼び出している
	}

	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
			System.out.println("残りの回数は" + poisonCount + "です");
		}
	}
}
