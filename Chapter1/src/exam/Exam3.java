package exam;

public class Exam3 {
	public static void main(String[] args) {
		
		int price = 980;
		int taxRate = 10;
		int taxFoodstuff = 8;
		
		System.out.println("商品の金額は" + price + "円です");
		System.out.println("消費税率は" + taxRate + "％です");
		System.out.println("税込みの金額は" + price * (100 + taxRate) / 100 + "円です");
		System.out.println("食品の場合、税率は" + taxFoodstuff + "％、税込み金額は" + price * (100 + taxFoodstuff) / 100 + "円です");
	}

}
