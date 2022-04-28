package exer2;

import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] data = scanBlank(sc.nextLine());
		Integer[][] mapData = new Integer[data[0]][data[0]];
		for (int i = 0; i < data[0]; i++) {
			for (int j = 0; j < data[0]; j++) {
				mapData[i][j] = Integer.parseInt(sc.nextLine().substring(j,j));
			}
		}
		

	}

	//　文字列を受け取って、空欄事に区切って、int配列に格納する
	public static Integer[] scanBlank (String str) {
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}	
	
//	

}
