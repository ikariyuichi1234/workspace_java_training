package exam2;

import java.util.Scanner;

public class Exam6 {

//	概要
//	入力された最初の数字と次の行の文字列を引数にしてメソッドを呼び出す
//	メソッドを一行目に入力される回数繰り返す
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < num; i++) {
			checkPoker(sc.nextLine());
		}
		sc.close();

	}
//　メソッド
//	入力された文字列を一文字ずつの配列に格納する
//	繰り返し２
//	繰り返し１
//	配列のi番目の要素がj番目の要素と一致する場合、イコールカウントを１増やす
//	jを１増やす
//	繰り返し１ここまで
//	イコールカウントがmaxより大きい場合、maxを上書きする
//	イコールカウントが２の場合、ペアカウントを１増やす
//	イコールカウントを０に戻す
//	iを１増やす
//	繰り返し２ここまで
//	重複数の最大値と２個重複する要素の種類数から、役名を出力する
//	
//	役名のルール
//	要素の中に同じ数値が4つ含まれている場合、フォーカード
//	要素の中に同じ数値が３つ含まれている場合、スリーカード
//	ペアカウントが４ならツーペア
//	ペアカウントが２ならワンペア
	
	public static void checkPoker (String str) {
		String[] array = str.split("");
		int pairCount = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			int equalCount = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					equalCount++;
				}
			}
			if (equalCount > max) {
				max = equalCount;
			}
			if (equalCount == 2) {
				pairCount++;
			}
		}
		if (max == 4) {
			System.out.println("Four Card");
		} else if (max == 3) {
			System.out.println("Three Card");
		} else if (pairCount == 4) {
			System.out.println("Two Pair");
		} else if (pairCount == 2) {
			System.out.println("One Pair");
		} else {
			System.out.println("No Pair");
		}
		
	}
}
