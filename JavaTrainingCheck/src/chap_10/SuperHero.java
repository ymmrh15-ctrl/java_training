package chap_10;

//子クラス extends 親クラスで継承
public class SuperHero extends Hero {
	boolean flying;

	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//着地
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

}
