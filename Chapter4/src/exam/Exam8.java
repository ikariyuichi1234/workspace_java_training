package exam;

import java.util.Random;

public class Exam8 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] numbers = new int[5];
		
		// 1
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(21) - 10;
		}
		
		//2
		System.out.println("入力された乱数");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//3
		System.out.println("");
		System.out.println("0より大きい数");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 0) {
				System.out.println(numbers[i]);
			}
		}
		
		//4
		System.out.println("");
		System.out.println("0より小さい数");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		//5
		System.out.println("");
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0) {
				count++;
			}
		}
		System.out.println("0の個数：" + count);
	}
}
