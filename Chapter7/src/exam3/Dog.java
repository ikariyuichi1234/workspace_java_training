package exam3;

class Dog{
	private String Name;
	private int Age;
	
	public void SetName (String nm) {
		Name = nm;
	}
	public void SetAge (int ageset) {
		Age = ageset;
	}
	public void ShowProfile () {
		System.out.println("名前は" + Name + "、年齢は" + Age + "歳です。");
	}

}

