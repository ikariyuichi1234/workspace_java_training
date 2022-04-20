package exam1;

import java.util.HashMap;
import java.util.Scanner;

public class Exam1 {

//	概要
//	二次元配列で５教科の成績を５つ管理
//	ハッシュマップで二次元配列と名前データを紐づけ
//	入力された名前から必要な成績を出力
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer[]> scoreStudent = new HashMap<>();
		Integer[][] score = new Integer[5][5];
		
//		以下を５回繰り返す
//		　生徒の名前を入力
		for (int i = 0; i < score.length; i++) {
			System.out.println("生徒の名前を入力");
			String name = sc.nextLine();
			
//		　その生徒の教科ごとの点数を入力、配列scoreに格納
			System.out.println("国語、数学、理科、社会、英語の点数を一行ずつ入力");
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] 
						= Integer.parseInt(sc.nextLine());
			}
//		　生徒の名前とscoreの紐づけ
			scoreStudent.put(name, score[i]);
		}
			
		System.out.println("表示する生徒の名前を入力");
		String name = sc.nextLine();
		
//		生徒の合計点を算出
		int sum = 0;
		for (int i = 0; i < scoreStudent.get(name).length; i++) {
			sum += scoreStudent.get(name)[i];
		}
		
//		点数の表示
		System.out.println(name + "の成績");
		System.out.print("国語：" + scoreStudent.get(name)[0] + "点、数学："+ scoreStudent.get(name)[1] + "点、理科："+ scoreStudent.get(name)[2] + "点、社会："+ scoreStudent.get(name)[3] + "点、英語："+ scoreStudent.get(name)[4] + "点");
		System.out.println();
		System.out.println("合計：" + sum + "点、平均：" + (double)((double)sum / scoreStudent.get(name).length) + "点");
		System.out.println();
		
		
		sc.close();
	}
}
