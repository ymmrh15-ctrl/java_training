/*作成者：山村　作成日：令和8年11月6日
switch文で条件分岐をする*/
package chap_3;

public class P121 {

	public static void main(String[] args) {
		System.out.println("食べ物の運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1, 2:
			System.out.println("洋食");
			break;
		case 3:
			System.out.println("和食");
			break;
		case 4, 5:
			System.out.println("中華");
		}

	}
}
