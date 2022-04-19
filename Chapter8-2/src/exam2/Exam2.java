package exam2;

public class Exam2 {
	private String action;
	
	public void setAction (String paramAct) {
		if (paramAct.equals("飛ぶ") || paramAct.equals("走る") || paramAct.equals("歩く") || paramAct.equals("しゃべる") || paramAct.equals("しゃがむ")) {
			action = paramAct;
		} else {
			System.out.println("そのアクションは現在設定できません");
		}
	}
	
	public void act () {
		if (action == null) {
			System.out.println("現在アクションは設定されていません");
		} else {
			System.out.println(action);
		}
	}
}
