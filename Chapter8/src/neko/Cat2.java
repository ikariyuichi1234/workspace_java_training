package neko;

public class Cat2 extends Cat {
	private int count;
	private double rand;
	private String hand;
	private boolean pattern01, pattern02, pattern03;
	
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
	public void fight (Cat2 other) {
		if (this.power > other.power) {
			System.out.println(other.name + "とケンカした。勝ったにゃ。");
		} else if (this.power < other.power) {
			System.out.println(other.name + "とケンカした。負けたにゃ。");
		} else {
			System.out.println(other.name + "とケンカした。勝負はつかなかったにゃ。");
		}
	}
	public void randomJanken () {
		rand = Math.random() * 3;
		if (rand < 1) {
			hand = "グー";
		} else if (rand < 2) {
			hand = "チョキ";
		} else {
			hand = "パー";
		}
	}
	public void janken (Cat2 other) {
		this.randomJanken();
		other.randomJanken();
		System.out.println(this.name + "は" + this.hand + "を、" + other.name + "は" + other.hand + "を出した。");
		pattern01 = this.hand.equals("グー") && other.hand.equals("チョキ");
		pattern02 = this.hand.equals("チョキ") && other.hand.equals("パー");
		pattern03 = this.hand.equals("パー") && other.hand.equals("グー");
		if (this.hand.equals(other.hand)) {
			System.out.println(this.name + "はじゃんけんで" + other.name + "とあいこだった。");
		} else if (pattern01 || pattern02 || pattern03) {
			System.out.println(this.name + "はじゃんけんで" + other.name + "に勝った。");
		} else {
			System.out.println(this.name + "はじゃんけんで" + other.name + "に負けた。");
		}
	}
}
