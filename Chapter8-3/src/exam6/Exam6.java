package exam6;

public class Exam6 {

	public static void main(String[] args) {
		Person per01 = new Person();
		LiePerson lie01 = new LiePerson();
		
		per01.setName("山田");
		per01.setAge(60);
		
		lie01.setName("松本");
		lie01.setAge(60);
		
		per01.showMe();
		lie01.showMe();
	}

}
