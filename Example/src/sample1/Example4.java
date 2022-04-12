package sample1;
// カリキュラム4章 配列
public class Example4 {

	public static void main(String[] args){
		// 以下のプログラムを、配列とfor文を使って書き直してください。
		// プログラムの機能を変えずに、コードをきれいに書き直す作業を、リファクタリングと言います。

		// このプログラムのやりたいこと、意図を日本語で書いたほうが良い。
		// 例）1年間の商品の在庫数を表示して、合計を計算し表示するプログラムです。

		int stock0 = 100;
		int stock1 = 500;
		int stock2 = 140;
		int stock3 = 300;
		int stock4 = 240;
		int stock5 = 220;
		int stock6 = 430;
		int stock7 = 350;
		int stock8 = 250;
		int stock9 = 190;
		int stock10 = 360;
		int stock11 = 140;

		int sumStock = 0;
		sumStock = sumStock + stock0;
		System.out.println("1月の在庫数は" + stock0 +  "個です。");
		sumStock = sumStock + stock1;
		System.out.println("2月の在庫数は" + stock1 +  "個です。");
		sumStock = sumStock + stock2;
		System.out.println("3月の在庫数は" + stock2 +  "個です。");
		sumStock = sumStock + stock3;
		System.out.println("4月の在庫数は" + stock3 +  "個です。");
		sumStock = sumStock + stock4;
		System.out.println("5月の在庫数は" + stock4 +  "個です。");
		sumStock = sumStock + stock5;
		System.out.println("6月の在庫数は" + stock5 +  "個です。");
		sumStock = sumStock + stock6;
		System.out.println("7月の在庫数は" + stock6 +  "個です。");
		sumStock = sumStock + stock7;
		System.out.println("8月の在庫数は" + stock7 +  "個です。");
		sumStock = sumStock + stock8;
		System.out.println("9月の在庫数は" + stock8 +  "個です。");
		sumStock = sumStock + stock9;
		System.out.println("10月の在庫数は" + stock9 +  "個です。");
		sumStock = sumStock + stock10;
		System.out.println("11月の在庫数は" + stock10 +  "個です。");
		sumStock = sumStock + stock11;
		System.out.println("12月の在庫数は" + stock11 +  "個です。");

		System.out.println("合計は" + sumStock + "個です。");
	}
}
