package test7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
* 以下条件を満たし、指定した文言を出力してください。
* ①条件：空白を含めた文字を入力してください。
* ②条件：空白を省いて文字を出力してください。
* 
* 出力例） aaa bb ccc
* 空白を省いた文字は「aaabbccc」です。
*/
public class Problem2 {
	/**
	 * mainメソッド
	 * 入力した文字の空白を省き、出力する
	 * @param args 実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String strDeleteBlank = str.replaceAll("　| ","");
		
		System.out.println("空白を省いた文字は「" + strDeleteBlank + "」です。");
	}
}