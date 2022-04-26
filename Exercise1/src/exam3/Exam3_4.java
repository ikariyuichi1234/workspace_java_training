package exam3;

import java.util.Scanner;
public class Exam3_4 {
	public static double minFar;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int circleNum = Integer.parseInt(sc.nextLine());
		
		String[] array = sc.nextLine().split(" ");
		int farFromCenter01 = Integer.parseInt(array[0]) * 100;
		int direction01 = getDirectionNum(array);
		
		array = sc.nextLine().split(" ");
		int farFromCenter02 = Integer.parseInt(array[0]) * 100;
		int direction02 = getDirectionNum(array);
		
//	方角数値の差の絶対値が0の場合、二つの地点は同一直線状の同一方向にある
		if (Math.abs(direction01 - direction02) == 0) {
			minFar = Math.abs(farFromCenter01 - farFromCenter02);
			
//	方角数値の差の絶対値が2の場合、二つの地点は同一直線状の反対方向にある
		} else if (Math.abs(direction01 - direction02) == 2) {
			minFar = Math.abs(farFromCenter01 + farFromCenter02);
			
//	どちらでもない場合、二つの地点はそれぞれの属する直線が垂直関係にある
		} else {
			minFar = getMinFar(farFromCenter01, farFromCenter02, circleNum);
		}
		
		System.out.println(minFar);
		
		sc.close();
	}
	
	
	
//	メソッド１
//	配列内の文字列を参照して数値を割り当てる
	public static int getDirectionNum (String[] array) {
		String direction = array[1];
		if (direction.equals("N")) {
			return 0;
		}
		if (direction.equals("E")) {
			return 1;
		}
		if (direction.equals("S")) {
			return 2;
			
		} else {
			return 3;
		} 
	}
	
//	メソッド２
//	直線距離の合計距離・各円心道路利用時の距離を比較して最短距離を返す
	public static double getMinFar (int far01, int far02, int circleNum) {
		double min = far01 + far02;
		for (int i = 1; i <= circleNum; i++) {
			double far = Math.abs(far01 - i * 100) + Math.abs(far02 - i * 100) + (double)(i * 100 * Math.PI / 2);
			if (min > far) {
				min = far;
			}
		}
		return min;
	}

}
