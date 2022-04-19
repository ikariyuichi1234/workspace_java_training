package exam5;

public class Exam5 {

	public static void main(String[] args) {
		String[] array = {"営業", "システム", "人事", "総務", "管理", "営業"};
		
		Test5 test = new Test5();
		int searchRet = test.search(array, 0, "営業");
		System.out.println("検索結果は" + searchRet + "件です。");
		
//		TestSuper testS = new TestSuper();
//		int point = testS.search(array, 0, "営業");
//		System.out.println(point + "番目にありました。");
	}

}
