package exam;

import java.util.ArrayList;
import java.util.Random;

public class Exam1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		while(true) {
			int num = rand.nextInt(11);
			System.out.println("0~10の値を出力：" + num);
			if(num == 0) {
				break;
			}
			if(num % 2 == 0) {
				even.add(num);
			}
			if(num % 2 == 1) {
				odd.add(num);
			}
		}
		System.out.println("偶数：" + even);
		System.out.println("奇数：" + odd);

	}

}
