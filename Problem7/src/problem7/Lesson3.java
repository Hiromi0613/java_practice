package problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 以下条件を満たし、指定した文言を出力してください。
* ①条件：文字列で数値を2つ入力し、数値を加算した結果を出力してください。
* ②条件：数値への変換はIntegerを利用してください。
* 
* 出力例）
* 1
* 5
* 1 + 5 = 6 です。
*/
public class Lesson3 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("数値を2つ入力してください。");
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);
		
		System.out.println(res1 + "+" + res2 + "=" + (res1 + res2) + "です。");
	}
}