package exam3;

public class ExamTest1 {
	private int[] numbers = new int[10];
	
	ExamTest1(){
		for (int i = 0; i < 10; i++) {
			numbers[i] = i + 1;
		}
	}
	ExamTest1(int n){
		for (int i = 0; i < 10; i++) {
			numbers[i] = n;
		}
	}
	public void printArray () {
		for (int numbersInt : numbers) {
			System.out.println(numbersInt);
		}
	}
	public int[] getNumbers () {
		return numbers;
	}
}
