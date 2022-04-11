package exam;

public class Exam16 {
	public static void main(String[] args) {
		
		char  hiragana = 'あ';
		int code = (int)hiragana;
		
		System.out.println("hiragana：" + hiragana);
		System.out.println("code：" + code);
		
		code++;
		
		char hiraganaNext = (char)code;
		
		System.out.println("codeインクリメントの結果：" + hiraganaNext);
	}

}
