package exam;

public class Exam5 {
	public static void main(String[] args) {
		
		char shape;
		int diameter;
		final float PI = 3.14159265359f;
		
		shape = '円';
		diameter = 30;
		
		System.out.println("形状：" + shape);
		System.out.println("直径：" + diameter);
		System.out.println("円周率：" + PI);
		System.out.println("面積：" + (float)diameter / 2 * (float)diameter / 2 * PI);		
	}

}
