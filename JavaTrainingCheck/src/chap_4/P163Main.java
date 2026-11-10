package chap_4;

public class P163Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;
	}

}
