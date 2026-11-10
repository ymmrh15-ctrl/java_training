package chap_4;

public class P167 {

	public static void main(String[] args) {
		//定義
		int[][] scores = new int[2][3];
		int sum = 0;
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		
		for (int i = 0; i < scores.length; i++) { //行を指定
			for (int j = 0; j < scores[i].length; j++) { //列を指定
				sum += scores[i][j];
			}
		}
		System.out.println(sum);

	}

}

