package test5;

/**
 * 受けとった２つの数値と演算子から計算結果を出力する
 */
public class Problem2classCalculation {
	/** 入力した一つ目の数値 */
	public double num1;
	/** 入力した二つ目の数値 */
	public double num2;
	/** 演算子 */
	public String operator;

	/**
	 * setNum1メソッド
	 * 一つ目の数値の引数を変数num1に代入する
	 * @param num1 一つ目の数値の引数
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	/**
	 * setNum2メソッド
	 * 二つ目の数値の引数を変数num2に代入する
	 * @param num2　一つ目の数値の引数
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	/**
	 * setOperatorメソッド
	 * 演算子の引数を変数operatorに代入する
	 * @param operator　演算子の引数
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	/**
	 * getReaultメソッド
	 * 演算子に沿った計算をし、結果を出力する
	 */
	public void getResult() {
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
