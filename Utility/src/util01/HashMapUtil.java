package util01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;


public class HashMapUtil {
	public static void main () {
		HashMap<Integer, Integer>map = new HashMap<>();
		
//	自動でキーソートするツリーマップ
		TreeMap<Integer, Integer>Tmap = new TreeMap<>();
		
// 　ハッシュマップをキーでソートする
		Object[] mapkey = Tmap.keySet().toArray();
    	Arrays.sort(mapkey);
    	
//    キーセットを使って値を全て表示
    	for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    	
//    キーセットを使ってキーを全て表示
    	for (Integer key : map.keySet()) {
            System.out.println(key);
        }
    	
//　　 Mapの値からArrayListを作成する
//　　　→要素番号から値(キー)を取得できるようになる
        ArrayList<Integer> list = new ArrayList<>(map.values());
        
        
        System.out.println(list);
	}
	
	
//	メソッド
//	各要素がひとつの空欄で区切られた文字配列を受け取る
//	文字配列の要素ひとつを空欄で区切る
//	IntegerIntegerのHashMapに格納する
	public static HashMap<Integer, Integer> getHashData (String[] cats) {
		HashMap<Integer, Integer> map = new HashMap<>();
		String[] array = new String[2];
		for (int i = 0; i < cats.length; i++) {
			array = cats[i].split(" ");
			map.put(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
		}
		return map;
	}
	
//	メソッド
//	数値データと文字列データを受け取る
//	数値データと文字列データを紐づけする
//	数値を参照にソートして文字列リストを作る
	public static List<String> getValueList (Integer[] data, String[] array) {
		TreeMap<Integer, String>map = new TreeMap<>();
		for (int i = 0; i < data.length; i++) {
			map.put(data[i], array[i]);
		}
		List<String> listSorted = new ArrayList<>(map.values());
		return listSorted;
	}
 
    

}
