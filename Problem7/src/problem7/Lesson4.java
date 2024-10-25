package problem7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
* 以下条件を満たし、指定した文言を出力してください。
* 
* ①条件：文字列を複数回入力し、Listへ追加してください。
* ②条件：Listの中に「Java」が含まれていたら「Javaが含まれています。」を表示し、含まれていなかったら「Javaが含まれていません。」を表示してください。
* 
* 出力例）
* Python
* PHP
* Java
* Javaが含まれています。
*/
public class Lesson4 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("文字列を複数回入力してください。");
		
		String[] List;
		List = new String[3];
		
		Integer[] num;
		num = new Integer[3];
		
		for(int i = 0; i < 3; i++) {
			List[i] = br.readLine();
		}
		for(int i = 0; i < 3; i++) {
			int a = List[i].indexOf("Java");
		}
	}
}