package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：check(...)、run(...)メソッドを持つProcessインターフェースを作成してください。
 * ②条件：Processインターフェースを継承したProcessA、ProcessBクラスを作成してください。
 * ③条件：mainメソッドは以下処理の流れで実装してください。
 * // 処理モード入力 1:Aモード、2:Bモード
 * // 名前、年齢入力
 * // 名前、年齢入力チェック
 * // 処理実行
 * ④条件：ProcessAのcheck()では名前が10文字未満、年齢が0〜140をチェックしてください。
 * ⑤条件：ProcessBのcheck()では名前が5〜20文字、年齢が30〜60をチェックしてください。
 * ⑥条件：ProcessAのrun()では「私の名前は〇〇です。年齢は〇〇です。」を出力してください。
 * ⑦条件：ProcessBのrun()では
 * 「
 * 名前：〇〇
 * 年齢：〇〇
 * 」
 * を出力してください。
 * 
 * 出力例）
 * 1
 * 山田太郎
 * 25
 * 私の名前は山田太郎です。年齢は25です。
 * 
 * 2
 * 斉藤翔
 * 33
 * 名前：斉藤翔
 * 年齢：33
 */
public class Problem2 {
	/**
	 * mainメソッド
	 * 数字と名前と年齢を入力し、数字毎に振り当てられた処理モードによって、
	 * 名前と年齢が条件に合っているか判断し、出力する
	 * @param args　実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		// 処理モード入力
		String str1 = br.readLine();
		int mode = Integer.parseInt(str1);
		
		// 名前入力
		String name = br.readLine();
		
		// 年齢入力
		String str2 = br.readLine();
		int age = Integer.parseInt(str2);
		
		Personal personal = new Personal();
		
		personal.setName(name);
		personal.setAge(age);
		
		String inputName = personal.getName();
		int inputAge = personal.getAge();
		
		ServiceManager manager = new ServiceManager();
		Process service = manager.getInstance(mode);
		
		// 名前、年齢入力チェック
		boolean result = service.check(inputName, inputAge);
		
		if(!result) {
			System.exit(0);
		}
		
		// 処理実行
		service.run();
	}
}