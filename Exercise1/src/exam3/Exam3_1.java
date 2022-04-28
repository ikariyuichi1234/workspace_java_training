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
		int lengthW = word.length();
		String lastW = word.substring(lengthW - 1, lengthW);
		String lastTwoW = word.substring(lengthW - 2, lengthW);
		String secondLastW = word.substring(lengthW - 2,lengthW - 1);
		String exceptLastW = word.substring(0,lengthW - 1);
		String exceptLastTwoW = word.substring(0,lengthW - 2);
		
//		末尾がs,sh,ch,o,xならesを追加して表示
		if (lastW.equals("s")) {
			System.out.println(word + "es");
			return;
		} else if (lastTwoW.equals("sh")) {
			System.out.println(word + "es");
			return;
		} else if (lastTwoW.equals("ch")) {
			System.out.println(word + "es");
			return;
		} else if (lastW.equals("o")) {
			System.out.println(word + "es");
			return;
		} else if (lastW.equals("x")) {
			System.out.println(word + "es");
			return;
			
//		末尾がf,feならそれを表示せずに、vesを追加して表示
		} else if (lastW.equals("f")) {
			System.out.println(exceptLastW + "ves");
			return;
		} else if (lastTwoW.equals("fe")) {
			System.out.println(exceptLastTwoW + "ves");
			return;
			
//		末尾がyかつ末尾から二文字目が子音なら末尾を表示せずに、末尾にiesを追加して表示
		} else if (lastW.equals("y")) {
			if (!secondLastW.equals("a") && !secondLastW.equals("i") && !secondLastW.equals("u") && !secondLastW.equals("e") && !secondLastW.equals("o")) {
				System.out.println(exceptLastW + "ies");
				return;
			}
		}
//		いずれにも当てはまらなければ、末尾にsを追加して表示
		System.out.println(word + "s");
	}

}
