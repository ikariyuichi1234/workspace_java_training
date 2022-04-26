package exam2;
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String [] array = str.split(" ");
		
		
//		左辺の第一項がxの場合
		if (array[0].equals("x")) {
			if (array[1].equals("+")) {
				System.out.println(Integer.parseInt(array[4]) - Integer.parseInt(array[2]));
			} else {
				System.out.println(Integer.parseInt(array[4]) + Integer.parseInt(array[2]));
			}
		}
		
//		左辺の第二項がxの場合
		if (array[2].equals("x")) {
			if (array[1].equals("+")) {
				System.out.println(Integer.parseInt(array[4]) - Integer.parseInt(array[0]));
			} else {
				System.out.println(Integer.parseInt(array[0]) - Integer.parseInt(array[4]));
			}
		}
		
//		右辺がxの場合
		if (array[4].equals("x")) {
			if (array[1].equals("+")) {
				System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[2]));
			} else {
				System.out.println(Integer.parseInt(array[0]) - Integer.parseInt(array[2]));
			}
		}
		
		sc.close();

	}

}
