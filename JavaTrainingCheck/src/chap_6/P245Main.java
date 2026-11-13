package chap_6;

public class P245Main {
	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
		java.util.Arrays.sort(heights);//パッケージ名.クラス名.メソッド名　昇順にする
		for (int h :heights) { 
			System.out.println(h);
	}
	
}
}  