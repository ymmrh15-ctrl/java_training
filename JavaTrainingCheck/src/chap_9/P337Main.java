package chap_9;

public class P337Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);

		//引数なしのコンストラクタでオーバーロードした
		Hero h2 = new Hero();
		System.out.println(h2.name);
	}
}
