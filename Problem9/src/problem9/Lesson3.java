package problem9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * 
 * ①条件：check(...)、setting(...)、run(...)メソッドを持つProcessクラスを作成してください。
 * ②条件：Processクラスを継承したProcessA、ProcessBクラスを作成してください。
 * ③条件：mainメソッドは以下処理の流れで実装してください。
 * // 処理モード入力 1:Aモード、2:Bモード
 * // 名前、年齢入力
 * // 名前、年齢入力チェック
 * // 名前、年齢設定
 * // 処理実行
 * ④条件：ProcessAのcheck()では名前が10文字未満、年齢が0〜140をチェックしてください。
 * ⑤条件：ProcessBのcheck()では名前が5〜20文字、年齢が30〜60をチェックしてください。
 * ⑥条件：setting()では名前、年齢を設定してください。
 * ⑦条件：ProcessAのrun()では「私の名前は〇〇です。年齢は〇〇です。」を出力してください。
 * ⑧条件：ProcessBのrun()では
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
public class Lesson3 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int mode = Integer.parseInt(str1);
		
		String str2 = br.readLine();
		
		String str3 = br.readLine();
		int age = Integer.parseInt(str3);
		
		if(mode == 1) {
			Process process = new ProcessA(str2, age);
			process.run();
		} else if(mode == 2) {
			Process process = new ProcessB(str2, age);
			process.run();
		}
	}
}