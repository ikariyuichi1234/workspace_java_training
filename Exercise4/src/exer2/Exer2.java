package exer2;

import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		
//	メソッド４に必要な情報を集める
		Scanner sc = new Scanner(System.in);
		Integer[] data = scanBlank(sc.nextLine());
		String[][] pixelStrData = scanPixel(data[0], data[0]);
		Integer[][] pixelData = dataTranceTwoD(pixelStrData);
		int outSize = data[0] / data[1];
		String[][] outData = new String[outSize][outSize];
		
//	出力用の二次元配列に平均データを格納していく
		for (int i = 0; i < outSize; i++) {
			for (int j = 0; j < outSize; j++) {
				outData[i][j] = getPixelAverage(pixelData,data[1], data[1], i * data[1],j * data[1]);
			}
		}
		
		for (String[] line : outData) {
			System.out.println(String.join(" ", line));
		}
		sc.close();
	}
		
//　メソッド１
//　文字列を受け取って、空欄事に区切って、Integer配列に格納する
	public static Integer[] scanBlank (String str) {
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}	
	
//	メソッド２
//	複数行の文字列について行数と列数の情報を受け取る
//	複数行の文字列を読み取って、それらを一文字ごとに区切って二次元配列に格納する
	public static String[][] scanPixel (int data01, int data02) {
		Scanner sc = new Scanner(System.in);
		String[][] mapData = new String[data01][data02];
		for (int i = 0; i < data01; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < data02; j++) {
				mapData[i] = line.split(" ");
			}
		}
		sc.close();
		return mapData;
	}
	
//	メソッド３
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
	
//	メソッド４
//	二次元配列、読み取り範囲の縦・横の長さ、
//	読み取り開始位置の縦・横の座標を受け取る
//	二次元配列から特定の範囲のデータを読み取って、
//	その平均値をStringで返す
	public static String getPixelAverage (Integer[][] data, int sizeY, int sizeX, int initY, int initX) {
		int sum = 0;
		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
				sum += data[i + initY][j + initX];
			}
		}
		return "" + sum / (sizeY * sizeX);
		
	}
	

	

}
