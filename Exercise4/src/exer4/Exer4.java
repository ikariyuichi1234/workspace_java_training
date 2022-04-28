package exer4;
import java.util.HashMap;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		String[] cats = new String[data[0]];
		for (int i = 0; i < data[0]; i++) {
			cats[i] = sc.nextLine();
		}
		HashMap<Integer, Integer> catsTimeStressMap = getHashData(cats);
		int sumStress;
		int sumTime;
		
//		全ての並び替えを試す(?)
		
		for (int i = 0; i < data[0]; i++) {
			for (int j = 0; j < data[0] - 1; j++) {
				
			}
		}
//		並び替え後の不満度が一定以下のものを抽出する
//		その中で食事時間が最短のものを選ぶ
		
		sc.close();

	}
//	各要素がひとつの空欄で区切られた文字配列を受け取る
//	文字配列の要素を空欄で区切る
//	HashMapに格納する
	public static HashMap<Integer, Integer> getHashData (String[] cats) {
		HashMap<Integer, Integer> map = new HashMap<>();
		String[] array = new String[2];
		for (int i = 0; i < cats.length; i++) {
			array = cats[i].split(" ");
			map.put(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
		}
		return map;
	}
	
	
	

}
