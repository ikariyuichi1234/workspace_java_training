package exam4;

class Seito {
	public String Name;
	public int Score;
	public String Rank;
	
	public void SetName (String setnm) {
		Name = setnm;
	}
	public String GetName () {
		return Name;
	}
	
	public void SetScore (int setsc) {
		Score = setsc;
	}
	public void ShowProfile () {
		System.out.println(Name + "さんは" + Score + "点でした。");
	}
	public String  ClassifyRank () {
		if (Score >= 80) {
			Rank = "A";
		} else if (Score >= 70) {
			Rank = "B";
		} else if (Score >= 50) {
			Rank = "C";
		}
		return Rank;
	}
}
