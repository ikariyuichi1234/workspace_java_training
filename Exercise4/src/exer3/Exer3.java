package exer3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Exer3 {
	public static void main (String[] args) {

//	メソッド２を起動するためのデータを集める
		Scanner sc = new Scanner(System.in);
		Integer[] protoData = scanBlank(sc.nextLine());
		Integer[] data = {protoData[0], protoData[1], Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())};
		String[] rawData = new String[data[3]];
		for (int i = 0; i < data[3]; i++) {
			rawData[i] = sc.nextLine();
		}
		 List<Integer> valueList = getValueList(rawData, data[0], data[1]);

		 int sum = 0;
		for (int i = 0; i < data[2]; i++) {
			sum += valueList.get(i);
		}
		System.out.println(sum / data[2]);
		
		sc.close();
	}
	
//	メソッド１
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
//	既知の地価に関するデータと調査対象の座標を受け取る
//	各データで距離を算出する
//	距離・地価　を　キー・値　にしたツリーマップに格納する
//	（＝キーを参照して値をソートする）
//　ツリーマップの値をリストに格納する
//	（＝要素番号で参照できる状態にする）
//	リストを返す
	public static List<Integer> getValueList (String[] array, int targetX, int targetY) {
		TreeMap<Integer, Integer>map = new TreeMap<>();
		for (int i = 0; i < array.length; i++) {
			Integer[] soreData = scanBlank(array[i]);
			int addX = soreData[0];
			int addY = soreData[1];
			int farD = (targetX - addX) * (targetX - addX) + (targetY - addY) * (targetY - addY);
			map.put(farD, soreData[2]);
		}
		List<Integer> list = new ArrayList<>(map.values());
		return list;
	}


}