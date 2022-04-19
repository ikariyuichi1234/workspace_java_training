package exam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
//		概要
//		入力された行数と列数を持つ多次元配列を作る
//		配列の全ての要素に乱数を代入する
//		配列の全ての要素を１行ごとに表示する
		
//		1　入力した値の行数と列数を持つ多次元配列dataを作成する
		Scanner sc = new Scanner(System.in);
		System.out.println("行数と列数を入力");
		String[][] data = new String[sc.nextInt()][sc.nextInt()];
		
//		2　｛（dataの要素１つに０～９９の乱数を代入する）を【列数】回行う｝を【行数】回行う
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				Integer rand = Integer.valueOf((int)(Math.random() * 100));
			    String randStr = rand.toString();
			    data[i][j] = randStr;
			}
		}
		
//		3　{dataの要素１行を文字列化して表示する｝を【行数】回行う
		for (int i = 0; i < data.length; i++) {
			String dataStr = String.join(" ",data[i]);
			System.out.println(dataStr);
		}
		sc.close();

	}

}
