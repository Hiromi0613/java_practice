package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第３章　実力確認問題
 * 
 * 整数値 x, y を入力し、以下のうち該当する条件を表示するプログラムを作成してください。
 * ・x は y より小さく、かつ、x と y は共に偶数である。
 * ・x と y は等しく、かつ、負の数である。
 * ・x は y より小さい、または、x は偶数である。
 */
public class Problem2 {
	
	/**
	 * ２つの値を入力し、値に応じた条件を出力する
	 * @param args　実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("xの値を入力してください。");
		
		/**
		 *  @String str1 入力した文字列
		 *  @int res1 xの値
		 */	
		String str1 = br.readLine();
		int res1 = Integer.parseInt(str1);
		
		System.out.println("yの値を入力してください。");
		
		/**
		 *  @String str2 入力した文字列
		 *  @int res2 yの値
		 */	
		String str2 = br.readLine();
		int res2 = Integer.parseInt(str2);
		
		if((res1 < res2) && (res1 % 2 == 0) && (res2 % 2 == 0)) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}
		else if((res1 == res2) && (res1 < 0) && (res2 < 0)) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		}
		else if((res1 < res2) || (res1 % 2 == 0)) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
		else {
			System.out.println("条件に該当しません。");
		}
	}
}