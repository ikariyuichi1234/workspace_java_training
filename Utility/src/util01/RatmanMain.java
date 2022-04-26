package util01;

import java.util.Scanner;

public class RatmanMain {

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
//	町から脱出するまで繰り返す
		int count = 0;
		while (true) {
			
			System.out.println(ra01.nowLine + " " + ra01.nowColumn);
			
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
	
	
	
//	ラットマンクラス
class Ratman {
	public int nowLine;
	public int nowColumn;
	public int nowDirection;

	//		初期位置の情報をセット
	//		方角は0が北、右に９０度変わるごとに+1
	public Ratman (int x, int y) {
		nowLine = x;
		nowColumn = y;
		nowDirection = 0;
	}

	//		メソッド１
	//		豊かな家を貧しく、貧しい家を豊かにする
	public String reverseRichPoor (String str) {
		//			String reStr01 = str.replaceAll("//" + "*", "保存");
		//			String reStr02 = reStr01.replaceAll("//" + ".", "*");
		//			return reStr02.replaceAll("保存", ".");
		String reStr01 = str.replaceAll("\\*", "保存");
		String reStr02 = reStr01.replaceAll("\\.","\\*");
		return reStr02.replaceAll("保存", "\\.");
	}

	//		メソッド２
	//		侵入後の家の貧富に応じて回転する
	public void move (String str) {
		if (str.equals("*")) {
			nowDirection++;
		} else {
			nowDirection--;
		}
		if (nowDirection == 4) {
			nowDirection = 0;
		}
		if (nowDirection == -1) {
			nowDirection = 3;
		}
		//		現在位置と方角に応じて移動する
		if (nowDirection == 0) {
			nowLine--;
		}
		if (nowDirection == 1) {
			nowColumn++;
		}
		if (nowDirection == 2) {
			nowLine++;
		}
		if (nowDirection == 3) {
			nowColumn--;
		}
	}

}

