package exam;

import java.util.ArrayList;
import java.util.Random;

public class Exam2 {

	public static void main (String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rand = new Random();
		
		while(true) {
			nums.add(rand.nextInt(101));
			System.out.println("0~100の値を出力：" + nums.get(nums.size() - 1));
			
			if(nums.get(nums.size() - 1) == 0) {
				break;
			}
		}

		for(int rank = 0; rank < 10; rank++) {
			int count = 0;
			System.out.println("");
			System.out.print("一の位が" + rank + ":");
			
			for(int i = 0; i < nums.size(); i++) {
				if(nums.get(i) % 10 == rank) {
					count++;
					System.out.print(nums.get(i) + " ");
				}
			}
			if(count == 0) {
				System.out.print("なし");
			}
		}

	}

}
