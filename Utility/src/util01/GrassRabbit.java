package util01;

import java.util.Scanner;

public class GrassRabbit {
	
	public static int num;
	public static String str;
	public static String Name;
	public static String[] array = new String[5];
	public static Integer[] data = new Integer[5];
	
//	概要
//	うさぎ（数未定義）がくさむら（数未定義）を複数回（数未定義）移動する
//	その結果を出力する
	
//	くさむらとうさぎを配列として生成する
//	くさむらはうさぎがいるなら1，いないなら0とする
//	うさぎは今いるくさむらの番号とする
	public static void Usagi () {
		Scanner sc = new Scanner(System.in);
		Integer[] grasses = new Integer[data[0]];
		Integer[] rabbits = new Integer[data[1]];
	
//	くさむら配列の【呼び出されたうさぎの初期位置】番目の要素を１にする
//	うさぎ配列の要素を【うさぎの初期位置-1】にする
//　くさむら配列の空要素を０にする
		for (int i = 0; i < data[1]; i++) {
			int rabNum = sc.nextInt();
			grasses[rabNum - 1] = 1;
			rabbits[i] = rabNum - 1;
		}
		for (int i = 0; i < grasses.length; i++) {
			if (grasses[i] == null) {
				grasses[i] = 0;
			}
		}
	
		
//	うさぎ移動
//		概要
//		「『うさぎの位置とくさむらの状況を読み込み、移動メソッドを実行
//		くさむらに移動結果を反映
//		うさぎの移動前の位置を保存
//		を全位置のうさぎが移動するまで繰り返す』
//		うさぎに移動結果を反映」
//		を【規定のセット数】回繰り返す
		
		Integer[] historyMove = new Integer[data[1]];
		
		for (int i = 0; i < data[2]; i++) {
			for (int j = 0; j < data[1]; j++) {
				int result = Jump(rabbits[j], grasses);
				grasses[result] = 1;
				grasses[rabbits[j]] = 0; 
				historyMove[j] = result;
			}
			for (int j = 0; j < data[1]; j++) {
				rabbits[j] = historyMove[j];
			}
		}
		
//	結果を出力
		for (int print : rabbits) {
			System.out.println(print + 1);
		}
		sc.close();
	}
//	メソッド１
//	「numがくさむら配列の要素数なら、numを1にする
//	そうでないなら、numを１増やす
//	dataのnum番目の要素が0なら、numを返して終了する
//	を繰り返す
	public static int Jump (int num, Integer[] data) {
		while (true) {
			if (num == data.length - 1) {
				num = 0;
			} else {
				num++;
			}
//			System.out.println(num + " " + data[num] + " " +data[num + 1]);
			if (data[num] == 0) {
				return num;
			} 
		}
	}

}
