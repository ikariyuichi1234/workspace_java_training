package exam6;

public class Person {
	public String name;
	public int age;
	
	public void setName (String setN) {
		name = setN;
	}
	public void setAge (int setA) {
		age = setA;
	}
	public String getName () {
		return name;
	}
	public int getAge () {
		return age;
	}
	public void showMe () {
		System.out.println("名前は" + name + "、年齢は" + age + "歳です。");
	}

}
