package exam;

public class Exam1 {

	public static void main(String[] args) {

//		1	２次元配列weekに日本語と英語の曜日データを格納する
		String[][] week = {{"日","月","火","水","木","金","土"}, {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.","Sat."}};
		
//		2	「〇曜日は英語では〇です」を【weekJpの要素数】回表示する
		for (int i = 0; i < week[0].length; i++) {
			System.out.println(week[0][i] + "曜日は英語では" + week[1][i] + "です");
		}
	}

}
