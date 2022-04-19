package exam4;

import java.util.Scanner;

public class Exam1 {
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jhStr = "";
		
		for (int i = 0; i == jhStr.length();) {
			JidouHanbaiki jh00 = new JidouHanbaiki();
			jhStr = sc.nextLine();
		}
		
		int jhInt = Integer.parseInt(jhStr);
		JidouHanbaiki jh01 = new JidouHanbaiki(jhInt);
		jh01.printMoney();
		
		sc.close();
	}
}
