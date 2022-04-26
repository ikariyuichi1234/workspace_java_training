package exam3;

import java.util.Scanner;

public class Exam3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] mainteData = scanBlank(sc.nextLine());
		Integer[] treeData = scanBlank(sc.nextLine());
		int checkNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < checkNum; i++) {
			Integer[] checkRange = scanBlank(sc.nextLine());
			treeData = maintainTree(treeData, checkRange, mainteData[1]);
		}
		System.out.println(String.join(" ", arrayTrance(treeData)));
		
		
		sc.close();

	}
	
//	メソッド１
//	文字列を受け取り、空欄事に区切ってint配列に格納する
	public static Integer[] scanBlank (String str) {
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}	
	
//	メソッド２
//	木の状況・調べる区間指定・必要最低平均を受け取る
//	木の状況を変更する
//	木の状況を返す
	public static Integer[] maintainTree (Integer[] treeData, Integer[] checkRange, int num) {
		int sum = 0;
		for (int i = checkRange[0] - 1; i < checkRange[1]; i++) {
			sum += treeData[i];
		}
		int average = sum / (checkRange[1] - checkRange[0] + 1);
		if (average - num < 0) {
			int addNum = num - average;
			for (int i = checkRange[0] - 1; i < checkRange[1]; i++) {
				treeData[i] += addNum;
			}
		}
		return treeData;
	}
	
//	メソッド３
//	int配列のString配列化
	public static String[] arrayTrance (Integer[] data) {
		String[] array = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			Integer num = Integer.valueOf(data[i]);
			array[i] = num.toString();
		}
		return array;
	}
}
