package exam;

public class Exam5 {

	public static void main(String[] args) {
		
		String[] jp_week = {"日","月","火","水","木","金","土"};
		String[] en_week = {"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."};
		
		for(int i = 0; i < jp_week.length; i++) {
			System.out.println(jp_week[i] + "曜日は英語では" + en_week[i] + "です");
			
		}

	}

}
