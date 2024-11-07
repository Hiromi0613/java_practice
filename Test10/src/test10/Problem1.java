package test10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：こちらのコードを元にしてください。
 * ②条件：check()でエラーとなった場合に、独自で定義したCustomExceptionをthrowするようにしてください。
 * ③条件：全ての処理に対して適宜例外処理を追加してください。
 * 
 * 出力例）
 * 1
 * 山田太郎
 * 27
 * 私の名前は山田太郎です。年齢は25です。
 * 
 * 2
 * 斉藤翔
 * 33
 * 名前：斉藤翔
 * 年齢：33
 */
public class Problem1 {
	/**
	 * mainメソッド
	 * 数字と名前と年齢を入力し、数字毎に振り当てられた処理モードによって、
	 * 名前と年齢が条件に合っているか判断し、出力する
	 * @param args　実行引数
	 * @throws IOException　入出力関係
	 * @throws NumberFormatException　文字列が数値型に変換できない
	 */
	public static void main(String[] args)throws IOException, NumberFormatException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//　処理モード入力
			String str1 = br.readLine();
			int mode = Integer.parseInt(str1);
			
			// 処理モードの入力チェック
			if(!(mode == 1 || mode == 2)) {
				throw new CustomException("処理モードには１または２を入力してください。");
			}
		
			//　名前入力
			String str2 = br.readLine();
		
			//　年齢入力
			String str3 = br.readLine();
			int age = Integer.parseInt(str3);
		
			Personal personal = new Personal();
		
			personal.setName(str2);
			personal.setAge(age);
		
			String inputName = personal.getName();
			int inputAge = personal.getAge();
		
			ServiceManager manager = new ServiceManager();
			ProcessBase process = manager.getinstance(mode);
		
			// 名前、年齢入力チェック
			process.check(inputName, inputAge);
			
			// 処理実行
			process.run(inputName, inputAge);
		} catch(CustomException ce) {
			System.out.println(ce.getMessage());
		} catch(NumberFormatException ne) {
			System.out.println("処理モードと年齢は数字を入力してください。");
		}
	}
}