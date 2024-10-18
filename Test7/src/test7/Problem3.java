package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：小数点を含む数値を入力してください。
 * ②条件：入力した数値を小数点第一位で四捨五入してください。
 * 
 * 出力例）
 * 4.6
 * 四捨五入した値は5です。
 */
public class Problem3 {
	/**
	 * mainメソッド
	 * 入力した文字の小数点第一位を四捨五入して出力する
	 * @param args　実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		double number = Double.parseDouble(str);
		
		System.out.println("四捨五入した値は" + Math.round(number) + "です。");
	}
}