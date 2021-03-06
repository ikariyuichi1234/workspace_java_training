package exam;

import java.util.Random;

public class Exam7 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10) + 1;	
		}
		
		// 1
		System.out.println("入力された乱数");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 2
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double average = (double)sum / (double)numbers.length;
	
		System.out.println("");
		System.out.println("合計値：" + sum + "、平均値：" + average);
		
		// 3
		System.out.println("");
		System.out.println("平均値より大きい数");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > average) {
				System.out.println(numbers[i]);
			}
		}
		
		// 4
		System.out.println("");
		System.out.println("平均値より小さい数");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < average) {
				System.out.println(numbers[i]);
			}
		}
	}

}
