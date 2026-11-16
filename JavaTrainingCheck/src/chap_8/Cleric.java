package chap_8;

public class Cleric {

	String name; //名前
	int hp = 50; //HP
	final int maxhp = 50; //最大HP
	int mp = 10; //MP
	final int maxmp = 10; //最大MP

	public void selfAid() {
		System.out.println(this.name + "セルフエイドを唱えた");
		this.hp = this.maxhp;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		//回復のアルゴリズム
		int recover = new java.util.Random().nextInt(3) + sec;
		//最大MPを超えて回復することはない
		//最大MP10 - MP6 = 4 or 回復ポイント5
		//このアルゴリズムは難しい
		int remp = Math.min(this.maxmp - this.mp, recover);

		this.mp += remp;
		System.out.println("MPが" + remp + "回復した");
		return remp;

	}

}
