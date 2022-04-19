package neko;

public class Exam2 {

	public static void main(String[] args) {
		Cat2 ca02 = new Cat2("ねこすけ", "がるる", 20, 40);
		Cat2 ca03 = new Cat2(20, 50);
		Cat2 ca04 = new Cat2("ポチ","わん");
		
		ca02.showMe();
		ca02.hotel(10);
		ca02.fight(ca03);
		ca02.janken(ca04);

	}

}
