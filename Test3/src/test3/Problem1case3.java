package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第3章　実力確認問題
 * 
 * 試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
 * 試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
 * 
 * 【ケース 3】
 * 80 点以上：「優」
 * 70 点以上、80 点未満：「良」
 * 60 点以上、70 点未満：「可」
 * 60 点未満：「不可」
 */
public class Problem1case3 {
	
	/**
	 * 入力した数値によって結果を分類分けする
	 * @param args 実行引数
	 * @throws IOException 例外処理
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("試験の点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		/**
		 *  @String str 入力した文字列
		 *  @int res 点数
		 */		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if((res >= 80) && (res <= 100)) {
			System.out.println("優");
		}
		else if((res >= 70) && (res < 80)) {
			System.out.println("良");
		}
		else if((res >= 60) && (res < 70)) {
			System.out.println("可");
		}
		else if((res >= 0) && (res < 60)) {
			System.out.println("不可");
		}
		else {
			System.out.println("点数を正しく入力してください。");
		}
	}
}