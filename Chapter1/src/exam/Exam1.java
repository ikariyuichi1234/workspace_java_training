package exam;

public class Exam1 {
	public static void main(String[] args) {
		
		String name = "パソコン";
		int pcPrice = 123500;
		int pcNumber = 13;
		final double TAX_RATE = 1.08;
		
		System.out.println(name + "を" + pcNumber + "台購入します。");
		System.out.println("合計金額は" + pcNumber * pcPrice + "円です。");
		System.out.println("税込み価格は" + (int)((double)pcNumber * (double)pcPrice * (double)TAX_RATE) + "円です。");
	}
	

}
