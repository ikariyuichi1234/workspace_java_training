package exam2;
import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split(" ");
		Integer[] data = dataTrance(array);
		
//		「成績が【入力一行目二番目の数値】以上の場合、ループ回数i＋1を表示」
//		を【入力一行目一番目の数値】回繰り返す
		for (int i = 0; i < data[0]; i++) {
			String scores = sc.nextLine();
			String[] scoreData = scores.split(" ");
			Integer[] newScoreData = dataTrance(scoreData);
			int result = newScoreData[0] - newScoreData[1] * 5;
			if (result < 0) {
				result = 0;
			}
			if (result >= data[1]) {
				System.out.println(i + 1);
			}
		}
		sc.close();
	}
	
//	　　String配列をInteger化する
	public static Integer[] dataTrance (String[] array) {
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
	}

}
