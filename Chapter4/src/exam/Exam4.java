package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int sum = 0;
		
		System.out.println("任意の数値を繰り返し入力");
		
		for(int i = 0; i < 10; i++) {
			int x = scan.nextInt();
			data.add(x);
			sum += x;
			
			if(sum > 100) {
				break;
			}
		}
		for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		scan.close();
	}

}
