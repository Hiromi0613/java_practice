package test5;

/**
*演算子（+、-、*、/）と計算値のフィールドを持つ計算クラスを作成してください。
*演算子と計算値を入力し、計算結果を出力してください。
*※出力はmainメソッドで行うこと。 出力例）
*
*1つ目の数値を入力してください。
*5
*2つ目の数値を入力してください。
*4
*演算子を入力してください。
*+
*計算結果：9
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * ２つの値と演算子を入力し、計算結果を出力する
 * @param args 実行引数
 */
public class Problem2 {
	public static void main(String[] args)throws IOException {
		Calculation c1 = new Calculation();
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください。");
		String str1 = br.readLine();
		double res1 = Double.parseDouble(str1);
		
		System.out.println("２つ目の数値を入力してください。");
		String str2 = br.readLine();
		double res2 = Double.parseDouble(str2);
		
		System.out.println("演算子を入力してください。");
		String str3 = br.readLine();
		
		c1.setNum(res1, res2);
		c1.setOperator(str3);
		
		c1.getResult();
	}
}