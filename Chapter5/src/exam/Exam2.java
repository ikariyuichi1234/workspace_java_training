package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

//		1	２次元配列weekに日本語と英語の色データを格納する
		String[][] color = {{"赤","青","黄","緑","白","黒","灰","紫"}, {"Red", "Blue", "Yellow", "Green", "White", "Black","Gray","Purple"}};
		
//		２　変数colorInに入力された文字列を代入する
		Scanner sc = new Scanner(System.in);
		System.out.println("日本語で色の名前を入力");
		String colorIn = sc.nextLine();
		
//		３　【colorInが日本語データと同じであれば、その日本語データと同じインデックスの英語データを出力する】を【日本語テータの要素数】回繰り返す
		for (int i = 0; i < color[0].length; i++) {
			if (colorIn.equals(color[0][i])) {
				System.out.println(color[1][i]);
			}
		}
		sc.close();

	}

}
