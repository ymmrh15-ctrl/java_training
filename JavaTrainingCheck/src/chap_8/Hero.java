package chap_8;

public class Hero {
	//フィールド
	String name;//名前の宣言
	int hp;//HPの宣言
	
	public void sleep() {//眠るメソッド
		this.hp = 100;//自分自身のインスタンスを生成するつまり自分のHPを100にする
		System.out.println(this.name + "は、眠って回復した！");
		
	}
	public void sit(int sec) {//座るメソッド
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った!");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {//転ぶメソッド
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}
	public void run() {//逃げるメソッド
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
