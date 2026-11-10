package chap_3;

public class P132Main {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if(i == 3) {
				continue;//この周だけスキップ
			}
		System.out.println(i);
		}
	}
}