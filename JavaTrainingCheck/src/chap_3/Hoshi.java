package chap_3;

public class Hoshi {

	public static void main(String[] args) {
		for (int i = 1;i < 6;i++) { //行
			for(int j = 1; j <= i;j++) {	//iの回数表示、列
				System.out.print("☆");
			}
			System.out.println("");
			
		}
	}
}
