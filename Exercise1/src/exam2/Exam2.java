package exam2;

import java.util.Scanner;

public class Exam2 {
	
//	概要
//	入力された数値の約数の合計を求める
//	約数の合計が【入力された数値】or【入力された数値-1】と同値か検証する
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		for (int i = 0; i < check; i++) {
			int num = sc.nextInt();
			int sum = sumDivisor(num);
			if (sum == num) {
				System.out.println("perfect");
			} else if (sum + 1 == num) {
				System.out.println("nearly");
			} else {
				System.out.println("neither");
			}
		}
		sc.close();
	}
	
//	引数以下の全ての数で、引数を割った余りが0か検証する
//	余りが0になった数を合計する
	public static int sumDivisor(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
