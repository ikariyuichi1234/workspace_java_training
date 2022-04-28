package util01;
//同一サブクラスから生成された他人とじゃんけん

public class Janken {
	public String name;
	public String hand;
	public double rand;

	public void janken (Janken other) {
		System.out.println(this.name + "は" + this.randomJanken() + "を、" + other.name + "は" + other.randomJanken() + "を出した。");
		boolean pattern01 = this.hand.equals("グー") && other.hand.equals("チョキ");
		boolean pattern02 = this.hand.equals("チョキ") && other.hand.equals("パー");
		boolean pattern03 = this.hand.equals("パー") && other.hand.equals("グー");
		if (this.hand.equals(other.hand)) {
			System.out.println(this.name + "はじゃんけんで" + other.name + "とあいこだった");
		} else if (pattern01 || pattern02 || pattern03) {
			System.out.println(this.name + "はじゃんけんで" + other.name + "に勝った");
		} else {
			System.out.println(this.name + "はじゃんけんで" + other.name + "に負けた");
		}
	}
	
	public String randomJanken () {
		rand = (int)(Math.random() * 30);
		if (rand < 10) {
			this.hand = "グー";
			return hand;
		} else if (rand < 20) {
			hand = "チョキ";
			return hand;
		} else {
			hand = "パー";
			return hand;
		}
	}


}

