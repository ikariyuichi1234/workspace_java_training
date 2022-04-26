package exam3_3;

public class Ratman {
	public int nowLine;
	public int nowColumn;
	public int nowDirection;
	
//	初期位置の情報をセット
//	方角は0が北、右に９０度変わるごとに+1
	public Ratman (int x, int y) {
		nowLine = x;
		nowColumn = y;
		nowDirection = 0;
	}
	
//	メソッド１
//	豊かな家を貧しく、貧しい家を豊かにする
	public String reverseRichPoor (String str) {
//		String reStr01 = str.replaceAll("//" + "*", "保存");
//		String reStr02 = reStr01.replaceAll("//" + ".", "*");
//		return reStr02.replaceAll("保存", ".");
		String reStr01 = str.replaceAll("\\*", "保存");
		String reStr02 = reStr01.replaceAll("\\.","\\*");
		return reStr02.replaceAll("保存", "\\.");
	}
	
//	メソッド２
//	侵入後の家の貧富に応じて回転する
	public void move (String str) {
		if (str.equals("*")) {
			nowDirection++;
		} else {
			nowDirection--;
		}
		if (nowDirection == 4) {
			nowDirection = 0;
		}
		if (nowDirection == -1) {
			nowDirection = 3;
		}
//	現在位置と方角に応じて移動する
		if (nowDirection == 0) {
			nowLine--;
		}
		if (nowDirection == 1) {
			nowColumn++;
		}
		if (nowDirection == 2) {
			nowLine++;
		}
		if (nowDirection == 3) {
			nowColumn--;
		}
	}

}
