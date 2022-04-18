package exam2;

public class CoinCase {
	public int yen500;
	public int yen100;
	public int yen50;
	public int yen10;
	public int yen5;
	public int yen1;
	public int amount;
	
	public void AddCoins (int kindNum, int coinNum) {
		if (kindNum == 500) {
			yen500 += coinNum; 
		} else if (kindNum == 100) {
			yen100 += coinNum;
		} else if (kindNum == 50) {
			yen50 += coinNum;
		} else if (kindNum == 10) {
			yen10 += coinNum;
		} else if (kindNum == 5) {
			yen5 += coinNum;
		} else if (kindNum == 1) {
			yen1 += coinNum;
		}
	}
	
	public int GetCoins (int kindNum) {
		if (kindNum == 500) {
			return yen500; 
		} else if (kindNum == 100) {
			return yen100;
		} else if (kindNum == 50) {
			return yen50;
		} else if (kindNum == 10) {
			return yen10;
		} else if (kindNum == 5) {
			return yen5;
		} else if (kindNum == 1) {
			return yen1;
		} else {
			return 0;
		}
	}
	
	public int GetAmount () {
		amount = yen500 * 500 + yen100 * 100 + yen50 * 50 + yen10 * 10 + yen5 * 5 + yen1 * 1;
		return amount;
	}
}
