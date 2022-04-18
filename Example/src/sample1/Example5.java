package sample1;
// カリキュラム5章 メソッド
public class Example5 {
	

	private static String Name;
	

//	概要
//	配列checkNamesを作成する
//	＊変数checkStrにcheckNames[i]を代入する
//	＊【引数にcheckStrを与えたメソッド１の戻り値】がtrueの場合、「checkNames[i]さんは正しい名前だと認識されました。」を表示する。
//	＊【引数にcheckStrを与えたメソッド１の戻り値】がfalseの場合、「checkNames[i]は有効な値ではありません。」を表示する
//	繰り返し：＊を【checkNamesの長さ】回繰り返す
	
	public static void main(String[] args){
		String[] checkNames = new String[] {
				"KouzouHosono",
				"",
				"HirutaKanata",
				"OdaDaisuke",
				"0123456",
				"No_name",
				"ShimizuHumihiko",
				"NakagawaNozomu",
				"99999999",
				"@@@@@@@@@"	
		};
		
		for (int i = 0; i < checkNames.length; i++) {

			Name = checkNames[i];
			if (!check01()) {
				System.out.println(checkNames[i] + "は有効な値ではありません。");
			} else if (!check02()) {
				System.out.println(checkNames[i] + "は有効な値ではありません。");
			} else if (!check03()) {
				System.out.println(checkNames[i] + "は有効な値ではありません。");
			} else if (!check04()) {
				System.out.println(checkNames[i] + "は有効な値ではありません。");
			} else {
				System.out.println(checkNames[i] + "さんは正しい名前だと認識されました。");

			String checkStr = checkNames[i];
			if (check01(checkStr)) {
				System.out.println(checkNames[i] + "さんは正しい名前だと認識されました。");
			} else {
				System.out.println(checkNames[i] + "は有効な値ではありません。");

			}
		}
	}
	


	
//	メソッド１
//	Nameが空文字の場合false、そうでなければtrueを返す
	public static boolean check01 () {
		if (Name.length() == 0) {

//	メソッド１
//	strを【引数にstrを与えたメソッド２の戻り値】で初期化する
//	strに"No_name"が含まれている場合、falseを戻り値とする
//	それ以外の場合、trueを戻り値とする
	public static boolean check01 (String str) {
		str = check02(str);
		if (str.contains("No_name")) {

			return false;
		} else {
			return true;
		}
	}

//	
//	メソッド２
//	Nameに0~9の数字が含まれる場合false、そうでなければtrueを返す
	public static boolean check02 () {
		if (Name.matches(".*([0-9]).*")) {
			return false;
		} else {
			return true;
		}
	}
//	メソッド３
//	Nameに@が含まれる場合false、そうでなければtrueを返す
	public static boolean check03 () {
		if (Name.contains("@")) {
			return false;
		} else {
			return true;
		}
	}
//	メソッド４
//	NameにNo_nameが含まれるfalse、そうでなければtrueを返す
	public static boolean check04 () {
		if (Name.contains("No_name")) {
			return false;
		} else {
			return true;
		}
	}
}	
		
		

//
//
//		// 以下のプログラムを、for文とメソッドを使ってリファクタリングしてください。
//
//		// 空文字、0～9の数字、@、No_nameが含まれるものはすべてエラーとして扱います。
//		// エラーの場合：入力された文字列"は有効な値ではありません。" と表示します。
//		// エラーではない場合：入力された文字列を表示します。

	
//	メソッド２
//	strが空文字の場合、strを"No_name"で初期化する
//	strを【引数にstrを与えたメソッド３の戻り値】で初期化する
//	strを戻り値とする
	public static String check02 (String str) {
		if (str.length() == 0) {
			str = "No_name";
		}
		str = check03(str);
		return str;
	}
//	
//	メソッド３
//	strに含まれる0~9の数字を"No_name"に置換する
//	strを【引数にstrを与えたメソッド４の戻り値】で初期化する
//	strを戻り値とする
	public static String check03 (String str) {
		str = str.replaceAll("[0-9]", "No_name");
		str = check04(str);
		return str;
	}
//	
//	メソッド４
//	strに含まれる@を"No_name"に置換する
//	strを戻り値とする
	public static String check04 (String str) {
		str = str.replaceAll("@", "No_name");
		return str;
	}
//	



}	
	

