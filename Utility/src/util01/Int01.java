package util01;

@SuppressWarnings("resource")
public class Int01 {
	public static String Name;
	public static int num;
	public static void main(String[] args) {
		
//	絶対値を取得する
		num = Math.abs(10 - 50);

	}
	
	public static int getMin (Integer[] numData) {
		int min = numData[0];
		for (int i = 0; i < numData.length; i++) {
			if (min > numData[i]) {
				min = numData[i];
			}
		}
		return min;
	}
	public static int getMax (Integer[] numData) {
		int max = numData[0];
		for (int i = 0; i < numData.length; i++) {
			if (max > numData[i]) {
				max = numData[i];
			}
		}
		return max;
	}
	public static int isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
