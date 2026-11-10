/*これはコメント
 　運勢を占うシステムです
 　作成者：山村　作成日：令和8年11月6日
 */
package chap_3;

public class P119Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {//swith文で条件分岐をしよう!!
		case 1 -> {
			System.out.println("大吉");
		}
		case 2 -> {
			System.out.println("中吉");
		}
		case 3 -> {
			System.out.println("吉");
		}
		default -> {
			System.out.println("凶");
		}
		}

	}
}
