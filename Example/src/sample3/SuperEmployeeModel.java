package sample3;

//従業員クラス
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
	SuperEmployeeModel () {
	}
	
	public SuperEmployeeModel(String nm, int no, String date, String pst) {
	this.name = nm;
	this.number = no;
	this.hireDate = date;
	this.post = pst;
}

}