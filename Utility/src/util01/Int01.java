package util01;

@SuppressWarnings("resource")
public class Int01 {
	public static String Name;
	public static int num;
	public static Integer[] data = new Integer[5];
	public static void main(String[] args) {
		
//	絶対値を取得する
		num = Math.abs(10 - 50);
	
//	乱数を取得する
		num = (int)Math.random() * 100 + 1;
		
//	乗数の計算
		num = (int)Math.pow(num,2);

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
	//配列の中身を昇順ソートする
	public static Integer[] getSort(Integer[] data) {
		for(int i = 0; i < data.length -1; i++){
			for(int j = data.length -1; j > i; j--){
				if(data[j - 1] > data[j]){
					int box = data[j];
					data[j] = data[j - 1];
					data[j - 1] = box;
				}
			}
		}
		return data;
	}

}
