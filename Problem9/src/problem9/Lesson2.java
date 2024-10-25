package problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：calculate(int x, int y)を定義したCalculateBaseインターフェースを作成してください。
 * ②条件：足し算、引き算、割り算、掛け算をするクラスを作成してください。
 * ③条件：1〜4の数値と、計算したい値を2つ入力して計算した結果を出力してください。
 * 
 * 出力例）
 * 1
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
public class Lesson2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		Calculate calculate = new Calculate();
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int operator = Integer.parseInt(str1);
		int x = Integer.parseInt(str2);
		int y = Integer.parseInt(str3);
		
		calculate.setOperator(operator);
		calculate.calculate(x,y);
		
		calculate.show();
	}
}