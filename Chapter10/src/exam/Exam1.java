package exam;

public class Exam1 {

	public static void main(String[] args) {
		int a[] = {0, 1, 2};
//  配列の内容を表示
		try {
			for(int i = 0; i < 4; i++){
				System.out.println("a[" + i + "]=" + a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("配列の範囲外の数値にアクセスしました。");
//			e.printStackTrace();
		}

	}

}
