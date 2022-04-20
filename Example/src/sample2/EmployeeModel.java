package sample2;

public class EmployeeModel {
	public String name;
	public int number;
	public String hireDate;
	public String post;
	
	public void setProfile (String nameS, int numS, String dateS, String postS) {
		name = nameS;
		number = numS;
		hireDate = dateS;
		post = postS;
	}
	public void setName (String nameS) {
		name = nameS;
	}
	public void setNumber (int numS) {
		number = numS;
	}
	public void setHireDate (String dateS) {
		hireDate = dateS;
	}
	public void setPost (String postS) {
		post = postS;
	}
	public void showProfile () {
		System.out.println("社員番号：" + number + " 名前：" + name + " 入社年月日：" + hireDate + " 役職："+ post);
	}
}
