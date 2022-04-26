package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {

	public static void main (String[] args) {
		
//		概要
//		１「入力内容を表示して配列に格納」を無入力されるまで繰り返す
//		２「配列の要素1つが5文字以上の場合、削除」を【配列の要素数】繰り返す
		
		System.out.println("文字列を入力してください");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> textdata = new ArrayList<String>();

//		１
		while (true) {
			String text = sc.nextLine();
	        System.out.println("文字列を入力：" + text);
		    textdata.add(text);
		    
		    if(text.length() == 0) {
		    	break;
		    }
		}

//		・最後に入力された要素を削除
        textdata.remove(textdata.size() - 1);
        
//      ２
        for (int i = textdata.size() - 1; i >= 0; i--) {
        	if ((textdata.get(i)).length() >= 5) {
        		textdata.remove(i);
        	}
        }
        
//      ・配列の内容を表示
        System.out.println("");
        System.out.println(textdata);
        
        sc.close();

	}

}