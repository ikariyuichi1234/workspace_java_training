package exam;

import java.util.ArrayList;

public class Exam15 {

//	概要
//	配列dataを作成する
//	配列arrayを【引数にdata、'あ'を与えたメソッドsearchArrayの戻り値】で初期化する
//	arrayの長さが0の場合、「該当する文字列はありませんでした」を表示する
//	そうでない場合、arrayの要素を全て表示する
	public static void main(String[] args) {
		String[] data = {"あさがお", "ひまわり", "きく", "あじさい", "ゆり"};
		ArrayList<String> array = searchArray(data, 'あ');
		
		if (array.size() == 0) {
			System.out.println("該当する文字列はありませんでした");
		} else {
			System.out.println(array);
		}
		

	}
//	メソッド１
//	ArrayList　searchStrを作成する
//	｛引数arrStr[i]の最初の文字が引数chと同値の場合、arrStr[i]をsearchStrに追加する｝を【arrStrの長さ】回繰り返す
//	searchStrを戻り値とする
	public static ArrayList<String> searchArray(String[] arrStr, char ch) {
		ArrayList<String> searchStr = new ArrayList<String>();
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].charAt(0) == ch) {
				searchStr.add(arrStr[i]);
			}
		}
		return searchStr;
	}
}
