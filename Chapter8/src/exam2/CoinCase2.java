package exam2;

public class CoinCase2 extends CoinCase{
	public int count;
	
	public int GetCount () {
		count = yen500 + yen100 + yen50 + yen10 + yen5 + yen1;
		return count;
	}
	
	public int GetAmount (int kindNum) {
		if (kindNum == 500) {
			return yen500 * 500; 
		} else if (kindNum == 100) {
			return yen100 * 100;
		} else if (kindNum == 50) {
			return yen50 * 50;
		} else if (kindNum == 10) {
			return yen10 * 10;
		} else if (kindNum == 5) {
			return yen5 * 5;
		} else if (kindNum == 1) {
			return yen1;
		} else {
			return 0;
		}
	}
}
