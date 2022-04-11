package exam;

public class Exam6 {

	public static void main(String[] args) {
		
		int[] numberes = {21,54,19,68,49,37,3,15,34,6};
		int max = numberes[0];
		int min = numberes[0];
		
		for(int i = 0; i < numberes.length; i++) {
			if(max < numberes[i]) {
				max = numberes[i];
			}
			
		}
		for(int i = 0; i < numberes.length; i++) {
			if(min > numberes[i]) {
				min = numberes[i];
			}
			
		}
		System.out.println("最大値：" + max +  "、最小値：" + min);

	}

}
