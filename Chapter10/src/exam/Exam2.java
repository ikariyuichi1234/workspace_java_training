package exam;

public class Exam2 {
	public static void main(String[] args) {
		try {
			for(int i = 0; i < 3 ; i++){
				for(int j = 0; j < 3; j++){
					System.out.print(i + "/ " + j + " = " + i/j + " ");
				}
				System.out.println();
			} 
		} catch (ArithmeticException e) {
//			System.err.println("0で除算しました。");
//			e.printStackTrace();
		} finally {
			for(int i = 0; i < 3 ; i++){
				for(int j = 1; j < 3; j++){
					System.out.print(i + "/ " + j + " = " + i/j + " ");
				}
				System.out.println();
			}
		}
	}
}

