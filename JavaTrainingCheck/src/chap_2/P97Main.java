package chap_2;

public class P97Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		//(x + y)で優先の評価をする
		String ans = "x+y" + (x + y);
		System.out.println(ans);
	}
}
