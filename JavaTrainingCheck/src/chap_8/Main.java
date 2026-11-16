package chap_8;

public class Main {

	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();//インスタンス化
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		//3.お化けキノコAを生成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		//4.お化けキノコBを生成
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険のはじまり
		System.out.println("お化けキノコ" + m1.suffix + "レベル" + m1.LEVEL + "が現れました");
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}
}