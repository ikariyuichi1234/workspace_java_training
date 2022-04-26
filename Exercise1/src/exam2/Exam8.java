package exam2;
import java.util.Scanner;
public class Exam8 {

	public static void main(String[] args) {

		
//		読み込んだ一行からチャージ金額、乗車回数を取得	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split(" ");
		Integer[] data = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		
		int charge = data[0];
		int point = 0;
		
//		運賃が入力されるごとに、
//		ポイントが運賃より多ければポイント支払い
//		そうでなければチャージ支払い＋ポイント獲得
		
		for (int i = 0; i < data[1]; i++) {
			int fare = sc.nextInt();
			if (point >= fare) {
				point -= fare;
			} else if (charge >= fare) {
				charge -= fare;
				point += fare / 10;
			}
			System.out.println(charge + " " + point);
		}
		sc.close();

	}

}
