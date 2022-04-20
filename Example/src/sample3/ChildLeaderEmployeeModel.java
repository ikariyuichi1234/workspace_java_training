package sample3;

public class ChildLeaderEmployeeModel extends SuperEmployeeModel {

	// 役職手当(円)
	public int postBenefit;

	// コンストラクタ
	public ChildLeaderEmployeeModel(String nm, int no, String date, String pst, int benef) {
		this.name = nm;
		this.number = no;
		this.hireDate = date;
		this.post = pst;
		this.postBenefit = benef;
	}

}
