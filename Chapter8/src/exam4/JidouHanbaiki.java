package exam4;

public class JidouHanbaiki {
	public int money;
	
	JidouHanbaiki () {
		System.out.println("金額を入力してください。");
	}
	JidouHanbaiki (int num) {
		money = num;
	}
	
//	メソッド１
//	moneyを1000で割った商を表示する
//	【moneyを1000で割った余り】を100で割った商を表示する
//	【moneyを100で割った余り】を10で割った商を表字する
	public void printMoney () {
		System.out.println("1000円札は" + (int)(money / 1000) + "枚です。");
		System.out.println("100円玉は" + (int)(money % 1000 / 100)+ "枚です。");
		System.out.println("10円玉は" + (int)(money % 100 / 10)+ "枚です。");
	}

}
