package sample1;

// カリキュラム11章 クラス応用(継承)
public class Example11 {

	public static void main(String[] args) {
		// 従業員クラスSuperEmployeeModelを継承したリーダー従業員クラスChildLeaderEmployeeModelを作ってください。
		// ChildLeaderEmployeeModelを使って、プログラムをリファクタリングしてください。

		LeaderEmployeeModel ldEmp1 = new LeaderEmployeeModel("細野公蔵", 101, "2015-04-01", "主任", 10000);
		SuperEmployeeModel emp2 = new SuperEmployeeModel("蛭田彼方", 202, "2017-04-01", "一般");
		LeaderEmployeeModel ldEmp3 = new LeaderEmployeeModel("清水文彦", 53, "2000-04-01", "係長", 30000);
		SuperEmployeeModel emp4 = new SuperEmployeeModel("中川望", 89, "2007-04-01", "一般");
		SuperEmployeeModel emp5 = new SuperEmployeeModel("織田大介", 93, "2010-09-01", "一般");

		System.out.println("社員番号：" + ldEmp1.number + " 名前：" + ldEmp1.name + " 入社年月日：" + ldEmp1.hireDate + " 役職："+ ldEmp1.post + " 役職手当：" + ldEmp1.postBenefit + "円" );
		System.out.println("社員番号：" + emp2.number + " 名前：" + emp2.name + " 入社年月日：" + emp2.hireDate + " 役職："+ emp2.post   );
		System.out.println("社員番号：" + ldEmp3.number + " 名前：" + ldEmp3.name + " 入社年月日：" + ldEmp3.hireDate + " 役職："+ ldEmp3.post + " 役職手当：" + ldEmp3.postBenefit + "円" );
		System.out.println("社員番号：" + emp4.number + " 名前：" + emp4.name + " 入社年月日：" + emp4.hireDate + " 役職："+ emp4.post   );
		System.out.println("社員番号：" + emp5.number + " 名前：" + emp5.name + " 入社年月日：" + emp5.hireDate + " 役職："+ emp5.post   );

	}

}


// --------------------------------------------------------------------------------------
// 以下はクラス定義です。
// --------------------------------------------------------------------------------------


// 従業員クラス
class SuperEmployeeModel{

	// 従業員の名前
	public String name;
	// 従業員ID
	public int number;
	// 入社年月日
	public String hireDate;
	// 役職
	public String post;

	// コンストラクタ
	public SuperEmployeeModel(String nm, int no, String date, String pst) {
		this.name = nm;
		this.number = no;
		this.hireDate = date;
		this.post = pst;
	}

}

// リーダー従業員クラス(従業員クラスを継承していない)
class LeaderEmployeeModel{

	// 従業員の名前
	public String name;
	// 従業員ID
	public int number;
	// 入社年月日
	public String hireDate;
	// 役職
	public String post;
	// 役職手当(円)
	public int postBenefit;

	// コンストラクタ
	public LeaderEmployeeModel(String nm, int no, String date, String pst, int benef) {
		this.name = nm;
		this.number = no;
		this.hireDate = date;
		this.post = pst;
		this.postBenefit = benef;
	}

}