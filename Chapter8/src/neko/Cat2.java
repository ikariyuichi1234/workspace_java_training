package neko;

public class Cat2 extends Cat {
	private int count;
	private int rand;
	
	Cat2 (String str01, String str02, int num01, int num02) {
		super(str01, str02, num01, num02); 
	}
	Cat2 () {
		name = "ネコ";
		song = "ニャン";
		power = 0;
		money = 0;
	}
	Cat2 (String str01, String str02){
		name = str01;
		song = str02;
		power = 0;
		money = 0;
	}
	Cat2 (int num01, int num02) {
		name = "ネコ";
		song = "ニャン";
		power = num01;
		money = num02;
	}
	public void hotel (int n) {
		System.out.println(n + "回泊まるにゃ。");
		while (money >= 10 && count < n) {
			this.hotel();
			count++;
		}
		if (count < n) {
			System.out.println("お金が足りない。追い出されたにゃ。");
		}
	}
	public void fight (Cat other) {
		if (this.power > other.power) {
			System.out.println(other.name + "とケンカした。勝ったにゃ。");
		} else if (this.power < other.power) {
			System.out.println(other.name + "とケンカした。負けたにゃ。");
		} else {
			System.out.println(other.name + "とケンカした。勝負はつかなかったにゃ。");
		}
	}
	public void janken (Cat other) {
		rand = (int)(Math.random() * 30);
		if (rand < 10) {
			System.out.println(other.name + "とじゃんけんした。勝ったにゃ。");
		} else if (rand < 20) {
			System.out.println(other.name + "とじゃんけんした。負けたにゃ。");
		} else {
			System.out.println(other.name + "とじゃんけんした。あいこにゃ。");
		}
//		System.out.println("(じゃんけん用乱数:" + rand + ")");
	}
}
