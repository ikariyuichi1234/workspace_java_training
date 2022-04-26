package exam3_3;

import java.util.Scanner;

public class Exam3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] townData = scanBlank(sc.nextLine());
		Integer[] ratInitialData = scanBlank(sc.nextLine());
		Ratman ra01 = new Ratman(ratInitialData[0] - 1, ratInitialData[1] - 1);
		
//	家の座標情報を二次元配列に格納する
		String[][] houseData = new String[townData[0]][townData[1]];
		
		for (int i = 0; i < townData[0]; i++) {
			houseData[i] = sc.nextLine().split("");
		}
		
		
//	現在地の情報を与えてra01にメソッド1を実行させ、現在地の情報を反転させる
//　現在地の情報を与えてra01にメソッド2を実行させる
//	町から脱出するor2000回より多く移動するまで繰り返す
		int count = 0;
		while (true) {
			
			houseData[ra01.nowLine][ra01.nowColumn] = ra01.reverseRichPoor(houseData[ra01.nowLine][ra01.nowColumn]);
			ra01.move(houseData[ra01.nowLine][ra01.nowColumn]);
			count++;
			
			if (ra01.nowLine == -1 || ra01.nowLine == townData[0]) {
				break;
			}
			if (ra01.nowColumn == -1 || ra01.nowColumn == townData[1]) {
				break; 
			}
			if (count > 2000) {
				break;
			}
		}
		
		
		for (int i = 0; i < houseData.length; i++) {
			System.out.println(String.join("", houseData[i]));
		}
	
		sc.close();

	}
	
//	読み込んだ一行を空欄ごとに区切ってint配列化
	public static Integer[] scanBlank (String str) {
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}

}
