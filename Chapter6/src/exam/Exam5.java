package exam;

public class Exam5 {
	
//	概要　｛引数に【ループ回数j】を与えてメソッドmultiを実行｝と｛改行｝を９回繰り返す
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
        	multi(j);
        	System.out.println("");
        }
    }
    
//    メソッド1　｛【引数】×【ループ回数i】の結果を改行せずに表示｝を９回繰り返す
    public static void multi(int num00) {
    	for (int i = 1; i <= 9; i++) {
    		System.out.print(num00 * i + " ");
    	}
    }

}
