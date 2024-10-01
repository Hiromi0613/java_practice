package test5;

/**
 * 受けとった２つの数値と演算子から計算結果を出力する
 */
class Calculation {
	/**
	 *  @param num1 入力した一つ目の数値
	 */
	public double num1;
	/**
	 *  @param num2 入力した二つ目の数値
	 */
	public double num2;
	/**
	 *  @param ope 演算子
	 */
	public String ope;

	/**
	 * setNum1メソッド
	 * 一つ目の数値の引数を変数num1に代入する
	 * @param n1 一つ目の数値の引数
	 */
	public void setNum1(double n1) {
		this.num1 = n1;
	}
	/**
	 * setNum2メソッド
	 * 二つ目の数値の引数を変数num2に代入する
	 * @param n2　一つ目の数値の引数
	 */
	public void setNum2(double n2) {
		this.num2 = n2;
	}
	/**
	 * setOperatorメソッド
	 * 演算子の引数を変数oに代入する
	 * @param o　演算子の引数
	 */
	public void setOperator(String o) {
		this.ope = o;
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
