package util01;

public class Err01 {

	public static void main(String[] args) {
		try {
			
		} catch (IndexOutOfBoundsException e) {
			System.err.println();
			System.err.println("例外処理：文字数範囲外指定");
		}
	}

}
