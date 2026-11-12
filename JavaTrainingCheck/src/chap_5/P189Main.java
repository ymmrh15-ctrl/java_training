package chap_5;



public class P189Main {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;//addメソッドないのみ //return ansのタイミングで化ける
	}
	public static void main(String[] args) {
		int ansans = add(100,10);//上とは別物 //add(100,10)が110に化ける
		System.out.println("100 + 10 = " + ansans);
	}

}
