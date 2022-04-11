package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {

	public static void main (String[] args) {
		System.out.println("文字列を入力してください");
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> textdata = new ArrayList<String>();
		 
		while (true) {
			String text = sc.nextLine();
	        System.out.println("文字列を入力：" + text);
		    textdata.add(text);
		    
		    if(text.length() == 0) {
		    	break;
		    }
		    
		}
        textdata.remove(textdata.size() - 1);
        
        for (int i = textdata.size() - 1; i >= 0; i--) {
        	if ((textdata.get(i)).length() >= 5) {
        		textdata.remove(i);
        	}
        }
        
        System.out.println("");
        System.out.println(textdata);
        
        sc.close();

	}

}