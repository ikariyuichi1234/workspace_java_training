package exam1;

public class Exam2 {

//	概要
//	配列で５教科の点数を管理
//	配列で５教科の教科名を管理
//	ハッシュマップで点数配列と教科名配列を紐づけ
//	クラスでハッシュマップと生徒名を紐づけ
//	入力された名前、教科名から必要な成績を出力
	public static void main(String[] args) {
		
		Seitoinfo st01 = new Seitoinfo();
		Seitoinfo st02 = new Seitoinfo();
		Seitoinfo st03 = new Seitoinfo();
		Seitoinfo st04 = new Seitoinfo();
		Seitoinfo st05 = new Seitoinfo();
		
		st01.setName();
		st02.setName();
		st03.setName();
		st04.setName();
		st05.setName();
		
		st01.setScore();
		st02.setScore();
		st03.setScore();
		st04.setScore();
		st05.setScore();
		
		st01.putMap();
		st02.putMap();
		st03.putMap();
		st04.putMap();
		st05.putMap();
		System.out.println();
		
		st01.printScore();
		st02.printScore();
		st03.printScore();
		st04.printScore();
		st05.printScore();
		
		st01.printSum();
		st02.printSum();
		st03.printSum();
		st04.printSum();
		st05.printSum();
		System.out.println();
		
		st01.printSubject("社会");
		st03.printSubject("数学");
		st05.printSubject("英語");
		
	}

}
