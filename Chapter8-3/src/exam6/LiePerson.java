package exam6;

public class LiePerson extends Person {
	public void showMe () {
		if (age > 5) {
			System.out.println("名前は" + name + "、年齢は" + (int)(age - 5) + "歳です。");
		} else {
			System.out.println("名前は" + name + "、年齢は" + 0 + "歳です。");
		}
	}
}
