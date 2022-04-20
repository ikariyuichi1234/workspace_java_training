package sample1;

// カリキュラム15章 例外処理
public class Example15 {

	public static void main(String[] args) {
		try {
			int a= 100;
			int ans = a / 0;

			System.out.println("答え：" + ans);
			
		} catch (ArithmeticException e) {
			System.err.println("0で除算しました。");
			e.printStackTrace();
		}
	}
}







		// このプログラムを実行すると、以下のような例外が発生して強制終了してしまいます。
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at sample1.Example8.ex8(Example8.java:11)
		// at sample1.SampleClass.main(SampleClass.java:23)

		// 例外処理try-catchを利用して、強制終了せずに、終了するよう修正してください。
		// また、どんな例外が発生したのかを表示してください。
