package exam2;
import java.util.Scanner;
public class Exam7 {

//	概要
//	一行目に入力される文字列から入力される配列の数、文字表示の行数、列数を獲得する
//	入力される文字列を配列に格納した後、ひとつなぎの文字列にする
//	ひとつなぎの文字列を文字表示の列数ごとに区切って配列に格納する
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	一行目のデータを読み込む
		String str = sc.nextLine();
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
//	以降の行を読み込んで、ひとつなぎの配列にする
		String[] strData = new String[data[0]];
		for (int i = 0; i < data[0]; i++) {
			strData[i] = sc.nextLine();
		}
		String longStr = String.join("", strData);
		
//	ひとつなぎの配列を列数ごとに改行して配列に格納する
		try {
			for (int i = 0; i < data[1]; i++) {
				for (int j = 0; j < data[2]; j++) {
					System.out.print(longStr.charAt(j + i * data[2]));
				}
				System.out.println();
			}
		} catch (IndexOutOfBoundsException e) {
//			System.err.println();
//			System.err.println("例外処理：文字数範囲外指定");
		}
		sc.close();


	}
}



