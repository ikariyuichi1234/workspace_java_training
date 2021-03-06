package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>(); 
		
		System.out.println("任意の数値を10個入力");
		
		for(int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				even.add(num);
				
			} else if(num % 2 == 1) {
				odd.add(num);
			}
		}
		Integer[] evenList = even.toArray(new Integer[even.size()]);
		Integer[] oddList = odd.toArray(new Integer[odd.size()]);
		
		Arrays.sort(evenList);
		Arrays.sort(oddList);
		
		String evenStr = Arrays.toString(evenList);
		String oddStr = Arrays.toString(oddList);
		
		System.out.println("偶数：" + evenStr);
		System.out.println("奇数：" + oddStr);
		
		scan.close();

	}

}
