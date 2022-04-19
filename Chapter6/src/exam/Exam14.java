package exam;

public class Exam14 {
	
//	概要
//	引数2, 5を与えてメソッドdiffの戻り値を表示する
//	引数5、2を与えてメソッドdiffの戻り値を表示する
	public static void main(String[] args) {
		System.out.println(diff(2, 5));
		System.out.println(diff(5, 2));

	}
//	メソッド１
//	引数num00が引数num01より大きい場合、変数diffansに【num00 - num01】を代入する
//	それ以外の場合、diffansに【num01 - num00】を代入する
//	diffansを戻り値とする
	public static int diff (int num00, int num01) {
		int diffans;
		if (num00 > num01) {
			diffans = num00 - num01;
		} else {
			diffans = num01 - num00;
		}
		return diffans;
	}

}
