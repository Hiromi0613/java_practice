package test9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：calculate(int x, int y)を定義したCalculateBaseインターフェースを作成してください。
 * ②条件：足し算、引き算、割り算、掛け算をするクラスを作成してください。
 * ③条件：1〜4の数値と、計算したい値を2つ入力して計算した結果を出力してください。
 * ④条件：if文は使用しないでください。
 * 
 * 出力例） 1
 * 2
 * 3
 * 2 + 3 = 5
 * 
 * 2
 * 3
 * 2
 * 3 - 2 = 1
 * 
 * 3
 * 4
 * 2
 * 4 / 2 = 2
 * 
 * 4
 * 2
 * 3
 * 2 * 3 = 6
 */
public class Problem1 {
	/**
	 * mainメソッド
	 * 1～4の数値と、計算したい値を2つ入力し、
	 * 1～4に割り当てられた演算子で二つの値を計算し、出力する
	 * @param args　実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int operator = Integer.parseInt(str1);
		
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str2);
		
		String str3 = br.readLine();
		int num2 = Integer.parseInt(str3);
		
		CalculateManager manager = new CalculateManager();
		CalculateBase base = manager.getInstance(operator);
		
		base.calculate(num1, num2);
		
		base.show();
	}
}