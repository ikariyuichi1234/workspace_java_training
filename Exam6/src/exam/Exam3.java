package exam;

public class Exam3 {

//	2　numに3,4,5を代入してメソッドdeltaを実行する
	public static void main(String[] args) {
		
		delta(3);
		
		delta(4);
		
		delta(5);

	}
	
//	1　｛(＄を改行なしで1つ表示する)を【i】回繰り返す｝を【num】回繰り返す
	public static void delta(int num){
		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}

}
