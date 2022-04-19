package neko;

public class Cat {
	public String name;
	public String song;
	public int power;
	public int money;
	
	Cat (){
	}
	
	Cat (String str01, String str02, int num01, int num02) {
		name = str01;
		song = str02;
		power = num01;
		money = num02;
	}
	
	public void showMe () {
		System.out.println("私は" + name + "、" + song + "と鳴きます。パワーは" + power + "、所持金は" + money + "円です。");
	}
	public void sing () {
		System.out.println(song);
	}
	public void sing (int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(song);
		}
		System.out.println("");
	}
	public void eat () {
		if (money < 1) {
			System.out.println("お金がたりない");
		} else {
			power += 10;
			money -= 1;
			System.out.println("おいしかった");
		}	
	}
	public void hotel () {
		if (money < 10) {
			System.out.println("野宿はつらい");
		} else {
			power += 20;
			money -= 10;
			System.out.println("あーよく寝た");
		}
	}
	public boolean tired () {
		if (power <= 0 && money <= 0) {
			return true;
		} else {
			return false;
		}
	}

}
