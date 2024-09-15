package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 血液型(A, B, O, AB)のいずれかを入力すると、それに対応した血液型占いのメッセージを表示してください。（メッセージの内容は任意）
 * *if文、switch文両方で作ること
 */
public class Problem8 {
	public static void main(String[] args)throws IOException {
		System.out.println("血液型を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(str);
		
		if((str == "A") || (str == "a"))  {
			System.out.println("几帳面");
		}
		else if((str == "B") || (str == "b")) {
			System.out.println("マイペース");
		}
		else if((str == "O") || (str == "o")) {
			System.out.println("大雑把");
		}
		else if((str == "AB") || (str == "ab")) {
		}
		else {
			System.out.println("正しく入力してください。");
		}
	}
}