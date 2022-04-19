package neko;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("名前・鳴き声・パワー・所持金 を入力");
		Cat ca01 = new Cat(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
		ca01.showMe();
		ca01.sing();
		ca01.sing(3);
		ca01.eat();
		ca01.hotel();
		
		if (ca01.tired()) {
			System.out.println("つかれたにゃ");
		} else {
			System.out.println("げんきにゃ");
		}
		
		sc.close();
	}

}
