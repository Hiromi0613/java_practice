package problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 以下条件を満たし、指定した文言を出力してください。
* ①条件：文字列は自由入力としてください。
* ②条件：入力した文字列の中に「A」が含まれていたら「Aが含まれています。」含まれていなかったら「Aが含まれていません」を出力してください。
* 
* 出力例）
* Absdft
* Aが含まれています。
*/
public class Lesson2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("文字列を入力してください。");
		
		String str = br.readLine();
		
		int num = str.indexOf("A");
		
		if(num >= 0) {
			System.out.println("Aが含まれています。");
		}
		else {
			System.out.println("Aが含まれていません。");
		}
	}
}