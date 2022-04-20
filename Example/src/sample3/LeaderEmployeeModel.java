package sample3;

//リーダー従業員クラス(従業員クラスを継承していない)
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
