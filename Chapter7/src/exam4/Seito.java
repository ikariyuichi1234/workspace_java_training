package exam4;

class Seito {
	private String Name;
	private int Score;
	private String Rank;
	
	public void SetName (String setnm) {
		Name = setnm;
	}
	public void SetScore (int setsc) {
		Score = setsc;
	}
	public void ShowProfile () {
		System.out.println(Name + "さんは" + Score + "点でした。");
	}
	public void  ClassifyRank () {
		if (Score >= 80) {
			Rank = "A";
		} else if (Score >= 70) {
			Rank = "B";
		} else if (Score >= 50) {
			Rank = "C";
		}
	}
	public void ShowRank () {
		System.out.println(Name + "さんは" + Rank + "ランクです。");
	}
}
