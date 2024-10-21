package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * ①条件：カンマ区切りの文字列を入力してください。
 * ②条件：カンマを除いた文字列で一つづつ出力してください。
 * 
 * 出力例）
 * リンゴ,ミカン,バナナ,ナシ
 * くだものを表示します。
 * リンゴ
 * ミカン
 * バナナ
 * ナシ
 */
public class Problem4 {
	/**
	 * 入力した文字列のカンマを除き、一つずつ出力する
	 * @param args　実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("くだものを表示します。");
		
		String[] array = str.split(",");

		for(String str2 : array) {
			System.out.println(str2);
		}
 	}
}