/***************************
 * 
 * 出力結果(参考)：
 * 
　　　　　　　　＊
　　　　　　　＊＊
　　　　　　＊＊＊
　　　　　＊＊＊＊
　　　　＊＊＊＊＊
　　　＊＊＊＊＊＊
　　＊＊＊＊＊＊＊
　＊＊＊＊＊＊＊＊
＊＊＊＊＊＊＊＊＊

 * 
 ***************************/

package for_modai;

public class for_modai4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i ++) {
			for (int j =  9;j < i; j--) {
				System.out.print(" ");
			for (int k = 0 ; k < 9; k++) {
				System.out.println("*");
			}
			}
			System.out.println("");
		}
	}

}
