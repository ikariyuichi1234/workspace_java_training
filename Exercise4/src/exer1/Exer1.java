package exer1;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
	
//	1行目の文字列データを数値データに変換する
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		
//	指定回数メソッドを実行する
		for (int i = 0; i < data[1]; i++) {
			separateWeigt(sc.nextInt(), data[0]);
		}
		
		sc.close();
	}
//	メソッド
//	みかんの重さと重さの基準になる値を受け取る
//	みかんが振り分けられた箱の値を表示する
	public static void separateWeigt (int orange, int step) {
		int result;
		if (orange % step >= step / 2) {
			result = (int)(orange / step + 1) * step; 
		} else {
			result = (int)(orange / step) * step;
		}
		if (result == 0) {
			result = step;
		}
		System.out.println(result);
	}

}
