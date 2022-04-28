package util01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("resource")
public class String01 {
	
	public static int num;
	public static String str;
	public static String Name;
	public static String[] array = new String[5];
	public static Integer[] data = new Integer[5];
	public static String[][] arrayTwo = new String[5][5];
	public static Integer[][] dataTwo = new Integer[5][5];
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//　Stringのint化、nextLine統一用
		num = Integer.parseInt(sc.nextLine());
		
//	intをString化
		str = (num + "");
		
//		一度Integerを中継する場合
//		or IntegerからStringに変換する場合
		Integer numInt = Integer.valueOf(num);
	    str = numInt.toString();
		
//　Stringの配列化
		array = str.split(" ");
	

//　配列のString化
		str = String.join(" ", array);
		
//	二次元配列のString化
		for (String[] line : arrayTwo) {
			str = String.join(" ", line);
		}
			
//	配列のArrayList化
		List<String> aList = Arrays.asList(array);
		
//	ArrayListの配列化
		String[] array = aList.toArray(new String[aList.size()]);
		
//	n文字目を取得
		char ch = str.charAt(0);
		
//	n文字目～m文字目を取得
		String msg01 = str.substring(0);
		String msg02 = str.substring(0,0);
		System.out.println(str.substring(0, str.length()));
//		↑全文表示
		
//	拡張for構文
//	配列の要素数回繰り返す
//	繰り返し分では配列要素がNANDEMOになる
		for (String NANDEMO : array){
			  System.out.println(NANDEMO);
			}
	}
	
	
//	int配列のString配列化
	public static String[] arrayTrance (int[] data) {
		String[] array = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			Integer num = Integer.valueOf(data[i]);
			array[i] = num.toString();
		}
		return array;
	}
	
//	String配列のInteger配列化
	public static Integer[] dataTranceTwoD (String[] array) {
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}
	
//	二次元String配列の二次元Integer配列化
	public static Integer[][] dataTranceTwoD (String[][] array) {
		Integer[][] data = new Integer[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				data[i][j] = Integer.parseInt(array[i][j]);
			}
		}
		return data;
	}	
	
//　文字列を受け取って、空欄事に区切って、Integer配列に格納する
	public static Integer[] scanBlank (String str) {
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}	

	
//　文字の置換
	public static String replaceStr (String str) {
		String reStr01 = str.replaceAll("A", "4");
		String reStr02 = reStr01.replaceAll("E", "3");
		String reStr03 = reStr02.replaceAll("G", "6");
		String reStr04 = reStr03.replaceAll("I", "1");
		String reStr05 = reStr04.replaceAll("O", "0");
		String reStr06 = reStr05.replaceAll("S", "5");
		return reStr06.replaceAll("Z", "2");
	}
	
//	Nameが空文字の場合false、そうでなければtrueを返す
	public static boolean check01 () {
		if (Name.length() == 0) {
			return false;
		} else {
			return true;
		}
	}

//	Nameに0~9の数字が含まれる場合false、そうでなければtrueを返す
	public static boolean check02 () {
		if (Name.matches(".*([0-9]).*")) {
			return false;
		} else {
			return true;
		}
	}
	
//	Nameに@が含まれる場合false、そうでなければtrueを返す
	public static boolean check03 () {
		if (Name.contains("@")) {
			return false;
		} else {
			return true;
		}
	}
	
//　ポーカーの役をチェック（スートなし、カード４枚）
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
	
	public static void loadAndArrange () {
//		複数行を読み込んで、ひとつなぎの配列にする
		Scanner sc = new Scanner(System.in);
		String[] strData = new String[data[0]];
		for (int i = 0; i < data[0]; i++) {
			strData[i] = sc.nextLine();
		}
		String longStr = String.join("", strData);

//		ひとつなぎの配列を列数ごとに区切って配列に格納する
		String[] newStrData = new String[data[2]];
		for (int i = 0; i < data[1]; i += data[2]) {
			newStrData[i] = longStr.substring(i,i + data[2]);
		}

		for (String print : newStrData) {
			System.out.println(print);
		}
		sc.close();
	}
	
//	二次元配列、読み取り範囲の縦・横の長さ、
//	読み取り開始位置の縦・横の座標を受け取る
//	二次元配列から特定の範囲のデータを読み取って、
//	その平均値を返す
	public static int getPixelAverage (Integer[][] data, int sizeY, int sizeX, int initY, int initX) {
		int sum = 0;
		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
				sum += data[i + initY][j + initX];
			}
		}
		return sum / (sizeY * sizeX);
	}	

	
///	メソッド１
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

	

//	複数行の文字列について行数と列数の情報を受け取る
//	複数行の文字列を読み取って、それらを一文字ごとに区切って二次元配列に格納する
	public static String[][] scanPixel (int data01, int data02) {
		Scanner sc = new Scanner(System.in);
		String[][] mapData = new String[data01][data02];
		for (int i = 0; i < data01; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < data02; j++) {
				mapData[i] = line.split("");
			}
		}
		sc.close();
		return mapData;
	}
}

