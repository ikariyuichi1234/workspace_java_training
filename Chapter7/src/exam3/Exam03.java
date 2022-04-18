package exam3;

public class Exam03 {

	public static void main(String[] args) {
		
		Dog firstdog = new Dog();
		Dog seconddog = new Dog();
		
		firstdog.SetName("ねこ");
		firstdog.SetAge(5000);
		
		seconddog.SetName("カブトムシ");
		seconddog.SetAge(4);
		
		firstdog.ShowProfile();
		seconddog.ShowProfile();
	}
}
