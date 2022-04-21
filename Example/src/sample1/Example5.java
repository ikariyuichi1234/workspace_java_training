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
			}
		}
	}
	



//	メソッド１
//	strを【引数にstrを与えたメソッド２の戻り値】で初期化する
//	strに"No_name"が含まれている場合、falseを戻り値とする
//	それ以外の場合、trueを戻り値とする
	public static boolean check01 () {
		if (Name.contains("No_name")) {

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
		
		

	

