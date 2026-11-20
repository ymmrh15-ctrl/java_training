package chap_12;



public abstract class Character implements Life{
	//フィールドの設定
	String name;
	int hp;
	

	//名前とHPを設定できる
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void run() {}
	public abstract void attack(Monster m);

}
