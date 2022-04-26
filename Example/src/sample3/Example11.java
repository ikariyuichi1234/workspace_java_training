package sample3;

// カリキュラム11章 クラス応用(継承)
public class Example11 {

	public static void main(String[] args) {
		ChildLeaderEmployeeModel ldEmp1 = new ChildLeaderEmployeeModel("細野公蔵", 101, "2015-04-01", "主任", 10000);
		SuperEmployeeModel emp2 = new SuperEmployeeModel("蛭田彼方", 202, "2017-04-01", "一般");
		ChildLeaderEmployeeModel ldEmp3 = new ChildLeaderEmployeeModel("清水文彦", 53, "2000-04-01", "係長", 30000);
		SuperEmployeeModel emp4 = new SuperEmployeeModel("中川望", 89, "2007-04-01", "一般");
		SuperEmployeeModel emp5 = new SuperEmployeeModel("織田大介", 93, "2010-09-01", "一般");

		System.out.println("社員番号：" + ldEmp1.number + " 名前：" + ldEmp1.name + " 入社年月日：" + ldEmp1.hireDate + " 役職："+ ldEmp1.post + " 役職手当：" + ldEmp1.postBenefit + "円" );
		System.out.println("社員番号：" + emp2.number + " 名前：" + emp2.name + " 入社年月日：" + emp2.hireDate + " 役職："+ emp2.post   );
		System.out.println("社員番号：" + ldEmp3.number + " 名前：" + ldEmp3.name + " 入社年月日：" + ldEmp3.hireDate + " 役職："+ ldEmp3.post + " 役職手当：" + ldEmp3.postBenefit + "円" );
		System.out.println("社員番号：" + emp4.number + " 名前：" + emp4.name + " 入社年月日：" + emp4.hireDate + " 役職："+ emp4.post   );
		System.out.println("社員番号：" + emp5.number + " 名前：" + emp5.name + " 入社年月日：" + emp5.hireDate + " 役職："+ emp5.post   );

	}
}
