package problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 以下条件を満たし、指定した文言を出力してください。
* 
* ①条件：Objectクラスを継承したCustomObjectクラスを作成してください。
* ②条件：toString()をオーバーライドして文字列の末尾に「です。」をつけて返却するようにしてください。
* ③条件：作成したtoString()を呼び出して任意の文言を出力してください。
* 
* 出力例）
* 〇〇です。
*/
public class Lesson1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		Custom custom = new Custom();
		
		String str = br.readLine();
		
		custom.setBr(str);
		
		System.out.println(custom);
	}
}