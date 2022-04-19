package exam1;

public class Exam3 {

	public static void main(String[] args) {
		Cat ca01 = new Cat();
		Dog do01 = new Dog();
		
		ca01.Name = "ねこっち";
		do01.Name = "いぬっち";
		
		ca01.Age = 10;
		do01.Age = 2;
		
		ca01.ShowProfile();
		do01.ShowProfile();
		
		ca01.Speak();
		do01.Speak();
	}

}
