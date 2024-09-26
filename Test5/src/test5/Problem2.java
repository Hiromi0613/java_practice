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
 * @param num1 入力した一つ目の数値
 * @param num2 入力した二つ目の数値
 * @param ope 演算子
 * @param result num1とnum2の計算結果
 */
class Calculation {
	double num1;
	double num2;
	String ope;
	
	void setNumOperator(double n1, double n2, String o) {
		num1 = n1;
		num2 = n2;
		ope = o;
	}
	void getResult() {
		double result = 0;
		switch(ope) {
		    case"+":
			    result = num1 + num2;
			    break;
		    case"-":
		    	result = num1 - num2;
		    	break;
		    case"*":
		    	result = num1 * num2;
		    	break;
		    case"/":
		    	if(num2 != 0) {
		    		result = num1 / num2;
		    	} else {
		    		System.out.println("入力した数値では割り切れません。");
		    	}
		    	break;
		    default:
		    	System.out.println("正しい演算子を入力してください。");
	}
		System.out.println("計算結果：" + result);
	}
	
}

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
		
		c1.setNumOperator(res1, res2, str3);
		
		c1.getResult();
	}
}