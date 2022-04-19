package exam3;

public class Exam1 {

	public static void main(String[] args) {
		ExamTest1 et01 = new ExamTest1();
		et01.printArray();
		
		System.out.println("");
		
		ExamTest1 et02 = new ExamTest1(6);
		int[] returnArray = et02.getNumbers();
		for (int numbersInt : returnArray) {
			System.out.println(numbersInt);
		}
	}

}
