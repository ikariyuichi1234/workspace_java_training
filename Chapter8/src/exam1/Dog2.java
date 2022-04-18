package exam1;

public class Dog2 extends Dog{
	
	public String dogKind;

	Dog2(String setkind) {
		this.dogKind = setkind;
	}
	public void ShowProfile() {
		System.out.println(Name + "の年齢は" + Age + "歳、犬種は" + dogKind + "です。");
	}
}
