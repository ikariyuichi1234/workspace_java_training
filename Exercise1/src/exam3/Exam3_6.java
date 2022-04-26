package exam3;
import java.util.Scanner;

public class Exam3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] data = scanBlank(sc.nextLine());
		Integer[] valueData = new Integer[data[0]];
		Integer[] breadData = new Integer[data[0]];
		
		for (int i = 0; i < data[0]; i++) {
			Integer[] breadInfo = scanBlank(sc.nextLine()); 
			valueData[i] = breadInfo[0];
			breadData[i] = breadInfo[1];
		}
		
//	クエリを指定回数繰り返す
		for (int i = 0; i < data[1]; i++) {
			String[] queryData = sc.nextLine().split(" ");
			Integer[] UpDownData = getBreadUpDownData(queryData);
			int price = 0;
			
			if (queryData[0].equals("buy")) {
				for (int j = 0; j < breadData.length; j++) {
					if (breadData[j] < UpDownData[j]) {
						price = -1;
						break;
					} else {
						breadData[j] -= UpDownData[j];
						price += UpDownData[j] * valueData[j];
					}
				}
				System.out.println(price);
			}
			if (queryData[0].equals("bake")) {
				for (int j = 0; j < breadData.length; j++) {
					breadData[j] += UpDownData[j];
				}
			}
		}

		sc.close();

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

	
//	文字配列を受け取って、種類ごとの数を表す数字配列を返す
	public static Integer[] getBreadUpDownData (String[] query) {
		Integer[] breadNum = new Integer[query.length - 1];
		for (int i = 0; i < breadNum.length; i++) {
			breadNum[i] = Integer.parseInt(query[i + 1]);
		}
		return breadNum;
	}



}
