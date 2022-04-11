package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam3 {

	public static void main (String[] args) {
		ArrayList<String> textdata = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("文字列を入力してください");

        while(true) {
        	String text = sc.nextLine();
            System.out.println("文字列を入力：" + text);
            textdata.add(text);
            
            if(text.length() == 0) {
            	break;
            }
        }
        System.out.println("");
        System.out.println(textdata);
        
        sc.close();


	}

}
