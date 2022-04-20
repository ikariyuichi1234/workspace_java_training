package sample2;

// カリキュラム7,8,9,10章 クラス(基礎編)
public class Example7_8_9_10 {

	public static void main(String[] args) {
		EmployeeModel em01 = new EmployeeModel();
		EmployeeModel em02 = new EmployeeModel();
		EmployeeModel em03 = new EmployeeModel();
		EmployeeModel em04 = new EmployeeModel();
		EmployeeModel em05 = new EmployeeModel();
		
		em01.setProfile("細野公蔵", 101, "2015-04-01", "主任");
		em02.setProfile("蛭田彼方", 202, "2017-04-01", "一般");
		em03.setProfile("清水文彦", 53, "2000-04-01", "係長");
		em04.setProfile("中川望", 89, "2007-04-01", "一般");
		em05.setProfile("織田大介", 93, "2010-09-01", "一般");
		
		em01.showProfile();
		em02.showProfile();
		em03.showProfile();
		em04.showProfile();
		em05.showProfile();
	}
}





//		// 以下のようなプログラムを、クラスを使ってリファクタリングしてください。
//		// ヒント：従業員クラス(class EmployeeModel)を作ります。
//
//		String name1 = "細野公蔵";
//		int number1 = 101;
//		String hireDate1 = "2015-04-01";
//		String post1 = "主任";
//
//		String name2 = "蛭田彼方";
//		int number2 = 202;
//		String hireDate2 = "2017-04-01";
//		String post2 = "一般";
//
//		String name3 = "清水文彦";
//		int number3 = 53;
//		String hireDate3 = "2000-04-01";
//		String post3 = "係長";
//
//		String name4 = "中川望";
//		int number4 = 89;
//		String hireDate4 = "2007-04-01";
//		String  post4 = "一般";
//
//		String name5 = "織田大介";
//		int number5 = 93;
//		String hireDate5 = "2010-09-01";
//		String post5 = "一般";
//
//
//		System.out.println("社員番号：" + number1 + " 名前：" + name1 + " 入社年月日：" + hireDate1 + " 役職："+ post1   );
//		System.out.println("社員番号：" + number2 + " 名前：" + name2 + " 入社年月日：" + hireDate2 + " 役職："+ post2   );
//		System.out.println("社員番号：" + number3 + " 名前：" + name3 + " 入社年月日：" + hireDate3 + " 役職："+ post3   );
//		System.out.println("社員番号：" + number4 + " 名前：" + name4 + " 入社年月日：" + hireDate4 + " 役職："+ post4   );
//		System.out.println("社員番号：" + number5 + " 名前：" + name5 + " 入社年月日：" + hireDate5 + " 役職："+ post5   );
//
//	}
//}







