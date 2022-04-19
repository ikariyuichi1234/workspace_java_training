package exam1;

public class Exam4 {

	public static void main(String[] args) {
		Animal[] an = new Animal[4];
		for (int i = 0; i < an.length; i++) {
			if (i % 2 == 0) {
				an[i] = new Cat();
			} else {
				an[i] = new Dog();
			}
		}
		for (int i = 0; i < an.length; i++) {
			an[i].Speak();
		}
	}

}
