package sample1;
// カリキュラム3章 条件分岐と繰り返し
public class Example3 {
	public static void main(String[] args){	
		
//		１　「表示回数が３の倍数なら表示回数を表示、３の倍数でないなら０を表示する」を３０回繰り返す	
		for (int cnt = 1; cnt < 31; cnt++) {
			if (cnt % 3 == 0) {
				System.out.println(cnt);
			} else {
				System.out.println("0");
			}
		}
	}
}



// 以下のプログラムを、for文を使って書き直してください。
// プログラムの機能を変えずに、コードをきれいに書き直す作業を、リファクタリングと言います。

//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}
//
//		cnt = cnt + 1;
//		if(cnt % 3 == 0){
//			System.out.println(cnt);
//		}else {
//			System.out.println("0");
//		}
//		if(cnt > 30) {
//			return;
//		}


