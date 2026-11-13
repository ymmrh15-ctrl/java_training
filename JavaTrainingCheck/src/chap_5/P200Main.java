package chap_5;

public class P200Main {

	public static void printArray(int[] array) { //
		for (int element : array) { //拡張for文
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int [] array = {1, 2, 3};
		printArray(array);
 	}

} 