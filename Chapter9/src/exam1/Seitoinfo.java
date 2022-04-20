package exam1;

import java.util.HashMap;
import java.util.Scanner;


public class Seitoinfo {
	HashMap<String, Integer> scoreSubject = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public String[] subject = {"国語", "数学", "理科", "社会", "英語"};
	public Integer[] score = new Integer[5];
	public String name;
	public int sum;
	
	public void setName () {
		System.out.println("生徒の名前を入力");
		name = sc.nextLine();
	}
	
	public void setScore () {
		System.out.println(name + "の国語、数学、理科、社会、英語の点数を一行ずつ入力");
		for (int i = 0; i < subject.length; i++) {
			score[i] = Integer.parseInt(sc.nextLine());
			sum += score[i];
		}
	}
	
	public void putMap () {
		for (int i = 0; i < subject.length; i++) {
			scoreSubject.put(subject[i], score[i]);
		}
	}
	
	public void printScore () {
		System.out.println(name + "の成績");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "：" + score[i] + "点");
		}
		System.out.println();
	}
	
	public void printSum () {
		System.out.println(name + "の総合成績");
		System.out.println("合計：" + sum + "点、平均：" + (double)((double)sum / (double)subject.length) + "点");
	}
	
	public void printSubject (String subjectS) {
		System.out.println(name + "の" + subjectS + "の成績：" + scoreSubject.get(subjectS) + "点");
	}

}

