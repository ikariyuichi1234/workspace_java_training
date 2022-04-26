package exam3;
import java.util.Scanner;

public class Exam3_1 {
	
//	メソッド１の呼び出しを【最初の行の数値】回繰り返す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for (int i  = 0; i < num; i++) {
			printCorrectWords(sc.nextLine());
		}
		sc.close();

	}
//	メソッド１
//	引数の末尾が特定のものであれば、処理を加える
	public static void printCorrectWords (String word) {
		
//		末尾がs,sh,ch,o,xならesを追加して表示
		if (word.substring(word.length() - 1,word.length()).equals("s")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 2,word.length()).equals("sh")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 2,word.length()).equals("ch")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 1,word.length()).equals("o")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 1,word.length()).equals("x")) {
			System.out.println(word + "es");
			
//		末尾がf,feならそれを表示せずに、vesを追加して表示
		} else if (word.substring(word.length() - 1,word.length()).equals("f")) {
			System.out.println(word.substring(0,word.length() -1) + "ves");
		} else if (word.substring(word.length() - 2,word.length()).equals("fe")) {
			System.out.println(word.substring(0,word.length() - 2) + "ves");
			
//		末尾がyかつ末尾から二文字目が子音なら末尾を表示せずに、末尾にiesを追加して表示
		} else if (word.substring(word.length() - 1,word.length()).equals("y")) {
			if (!word.substring(word.length() - 2,word.length() - 1).equals("a")) {
				if (!word.substring(word.length() - 2,word.length() - 1).equals("i")) {
					if (!word.substring(word.length() - 2,word.length() - 1).equals("u")) {
						if (!word.substring(word.length() - 2,word.length() - 1).equals("e")) {
							if (!word.substring(word.length() - 2,word.length() - 1).equals("o")) {
								System.out.println(word.substring(0,word.length() - 1) + "ies");
							}
						}
					}
				}
			}
//		いずれにも当てはまらなければ、末尾にsを追加して表示
		} else {
			System.out.println(word);
		}
	}

}
