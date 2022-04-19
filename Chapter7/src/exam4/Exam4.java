package exam4;

public class Exam4 {

	public static void main(String[] args) {
		
		Seito sei01 = new Seito();
		Seito sei02 = new Seito();
		Seito sei03 = new Seito();
		Seito sei04 = new Seito();
		Seito sei05 = new Seito();
		
		sei01.SetName("John");
		sei02.SetName("Mike");
		sei03.SetName("Jude");
		sei04.SetName("Bess");
		sei05.SetName("Lisa");
		
		sei01.SetScore(90);
		sei02.SetScore(60);
		sei03.SetScore(70);
		sei04.SetScore(100);
		sei05.SetScore(55);
		
		sei01.ShowProfile();
		sei02.ShowProfile();
		sei03.ShowProfile();
		sei04.ShowProfile();
		sei05.ShowProfile();
		
		System.out.println(sei01.Name + "さんのランクは" + sei01.ClassifyRank() + "です。");
		System.out.println(sei02.Name + "さんのランクは" + sei02.ClassifyRank() + "です。");
		System.out.println(sei03.Name + "さんのランクは" + sei03.ClassifyRank() + "です。");
		System.out.println(sei04.Name + "さんのランクは" + sei04.ClassifyRank() + "です。");
		System.out.println(sei05.Name + "さんのランクは" + sei05.ClassifyRank() + "です。");
	}
}
