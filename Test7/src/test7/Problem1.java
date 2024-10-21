package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
* 以下条件を満たし、指定した文言を出力してください。
* 
* ①条件：日付を入力してください。
* ②条件：日付にプラス1カ月した日付を出力してください。
* ※java.time.LocalDateを使用すること。
* 
* 出力例）
* 2024/04/18
* 1月後は2024/5/18です。
*/
public class Problem1 {
	
	/**
	 * mainメソッド
	 * 入力した日付の1カ月後の日付を出力する
	 * @param args 実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println("日付を入力してください。");
		
		String str = br.readLine();
		
		LocalDate date = LocalDate.parse(str, formatter);
		LocalDate nextMonth = date.plusMonths(1);
		
		System.out.println("１月後は" + nextMonth.format(formatter) + "です。");
	}
}