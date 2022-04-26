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
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//　Stringのint化、nextLine統一用
		num = Integer.parseInt(sc.nextLine());
		
//　Stringの配列化
		array = str.split(" ");
		
//　配列のString化
		str = String.join(" ", array);
		
//	配列のArrayList化
		List<String> aList = Arrays.asList(array);
		
//	ArrayListの配列化
		String[] array = aList.toArray(new String[aList.size()]);
		
//	n文字目を取得
		char ch = str.charAt(0);
		
//	n文字目～m文字目を取得
		String msg = str.substring(0,0);
		System.out.println(str.substring(0, str.length()));
//		↑全文表示
		
//		拡張for構文
//		配列の要素数回繰り返す
//		繰り返し分では配列要素がNANDEMOになる
		for (String NANDEMO : array){
			  System.out.println(NANDEMO);
			}
	}
	
//　intのString化
	public static String IntCatchStrReturn (int n) {
		Integer num = Integer.valueOf(n);
	    return num.toString();
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
	public static Integer[] dataTrance (String[] array) {
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		return data;
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
	
	

	
//	引数の末尾が特定のものであれば、処理を加える
	public static void printCorrectWords (String word) {
		
//		末尾がs,sh,ch,o,xならesを追加して表示
		if (word.substring(word.length() - 1,word.length()).equals("s")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 2,word.length()).equals("sh")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 2,word.length()).equals("ch")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 1,word.length()).equals("o")) {
			System.out.println(word + "es");
		} else if (word.substring(word.length() - 1,word.length()).equals("x")) {
			System.out.println(word + "es");
			
//		末尾がf,feならそれを表示せずに、vesを追加して表示
		} else if (word.substring(word.length() - 1,word.length()).equals("f")) {
			System.out.println(word.substring(0,word.length() -1) + "ves");
		} else if (word.substring(word.length() - 2,word.length()).equals("fe")) {
			System.out.println(word.substring(0,word.length() - 2) + "ves");
			
//		末尾がyかつ末尾から二文字目が子音なら末尾を表示せずに、末尾にiesを追加して表示
		} else if (word.substring(word.length() - 1,word.length()).equals("y")) {
			if (!word.substring(word.length() - 2,word.length() - 1).equals("a")) {
				if (!word.substring(word.length() - 2,word.length() - 1).equals("i")) {
					if (!word.substring(word.length() - 2,word.length() - 1).equals("u")) {
						if (!word.substring(word.length() - 2,word.length() - 1).equals("e")) {
							if (!word.substring(word.length() - 2,word.length() - 1).equals("o")) {
								System.out.println(word.substring(0,word.length() - 1) + "ies");
							}
						}
					}
				}
			}
//		いずれにも当てはまらなければ、末尾にsを追加して表示
		} else {
			System.out.println(word);
		}
	}
	
	

	


}
