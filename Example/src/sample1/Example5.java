package sample1;
// カリキュラム5章 メソッド
public class Example5 {
	
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
			String checkStr = checkNames[i];
			if (check01(checkStr)) {
				System.out.println(checkNames[i] + "さんは正しい名前だと認識されました。");
			} else {
				System.out.println(checkNames[i] + "は有効な値ではありません。");
			}
		}
	}
	
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
		
		

//
//
//		// 以下のプログラムを、for文とメソッドを使ってリファクタリングしてください。
//
//		// 空文字、0～9の数字、@、No_nameが含まれるものはすべてエラーとして扱います。
//		// エラーの場合：入力された文字列"は有効な値ではありません。" と表示します。
//		// エラーではない場合：入力された文字列を表示します。
//		String[] checkNames = new String[]{
//				"KouzouHosono",
//				"",
//				"HirutaKanata",
//				"OdaDaisuke",
//				"0123456",
//				"No_name",
//				"ShimizuHumihiko",
//				"NakagawaNozomu",
//				"99999999",
//				"@@@@@@@@@"
//		};
//
//
//		if(checkNames[0] == "") {
//			System.out.println(checkNames[0] +"は有効な値ではありません。");
//		}else if(checkNames[0].contains("@")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("0")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("1")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("2")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("3")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("4")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("5")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("6")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("7")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("8")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0].contains("9")) {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else if(checkNames[0] == "No_name") {
//			System.out.println(checkNames[0] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[0] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[1] == "") {
//			System.out.println(checkNames[1] +"は有効な値ではありません。");
//		}else if(checkNames[1].contains("@")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("0")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("1")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("2")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("3")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("4")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("5")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("6")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("7")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("8")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1].contains("9")) {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else if(checkNames[1] == "No_name") {
//			System.out.println(checkNames[1] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[1] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[2] == "") {
//			System.out.println(checkNames[2] +"は有効な値ではありません。");
//		}else if(checkNames[2].contains("@")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("0")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("1")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("2")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("3")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("4")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("5")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("6")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("7")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("8")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2].contains("9")) {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else if(checkNames[2] == "No_name") {
//			System.out.println(checkNames[2] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[2] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[3] == "") {
//			System.out.println(checkNames[3] +"は有効な値ではありません。");
//		}else if(checkNames[3].contains("@")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("0")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("1")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("2")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("3")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("4")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("5")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("6")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("7")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("8")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3].contains("9")) {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else if(checkNames[3] == "No_name") {
//			System.out.println(checkNames[3] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[3] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[4] == "") {
//			System.out.println(checkNames[4] +"は有効な値ではありません。");
//		}else if(checkNames[4].contains("@")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("0")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("1")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("2")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("3")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("4")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("5")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("6")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("7")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("8")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4].contains("9")) {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else if(checkNames[4] == "No_name") {
//			System.out.println(checkNames[4] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[4] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[5] == "") {
//			System.out.println(checkNames[5] +"は有効な値ではありません。");
//		}else if(checkNames[5].contains("@")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("0")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("1")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("2")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("3")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("4")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("5")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("6")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("7")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("8")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5].contains("9")) {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else if(checkNames[5] == "No_name") {
//			System.out.println(checkNames[5] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[5] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[6] == "") {
//			System.out.println(checkNames[6] +"は有効な値ではありません。");
//		}else if(checkNames[6].contains("@")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("0")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("1")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("2")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("3")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("4")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("5")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("6")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("7")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("8")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6].contains("9")) {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else if(checkNames[6] == "No_name") {
//			System.out.println(checkNames[6] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[6] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[7] == "") {
//			System.out.println(checkNames[7] +"は有効な値ではありません。");
//		}else if(checkNames[7].contains("@")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("0")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("1")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("2")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("3")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("4")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("5")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("6")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("7")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("8")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7].contains("9")) {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else if(checkNames[7] == "No_name") {
//			System.out.println(checkNames[7] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[7] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[8] == "") {
//			System.out.println(checkNames[8] +"は有効な値ではありません。");
//		}else if(checkNames[8].contains("@")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("0")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("1")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("2")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("3")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("4")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("5")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("6")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("7")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("8")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8].contains("9")) {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else if(checkNames[8] == "No_name") {
//			System.out.println(checkNames[8] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[8] + "さんは正しい名前だと認識されました。");
//		}
//
//
//		if(checkNames[9] == "") {
//			System.out.println(checkNames[9] +"は有効な値ではありません。");
//		}else if(checkNames[9].contains("@")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("0")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("1")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("2")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("3")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("4")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("5")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("6")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("7")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("8")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9].contains("9")) {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else if(checkNames[9] == "No_name") {
//			System.out.println(checkNames[9] + "は有効な値ではありません。");
//		}else {
//			System.out.println(checkNames[9] + "さんは正しい名前だと認識されました。");
//		}
//	}
//}
