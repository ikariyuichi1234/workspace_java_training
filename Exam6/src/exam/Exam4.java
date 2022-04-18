package exam;

public class Exam4 {

//	2　numに7,8,9を代入、chaにS、T、Rを代入してメソッドdeltaを実行する
	public static void main(String[] args) {
		
		delta(7, 'S');
		
		delta(8, 'T');
		
		delta(9, 'R');

	}
	
//	1　｛(chaを改行なしで1つ表示する)を【i】回繰り返す｝を【num】回繰り返す
	public static void delta(int num, char cha){
		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(cha);
			}
			System.out.println("");
		}
	}

}