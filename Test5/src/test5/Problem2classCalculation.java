package test5;

/**
 * @param result num1とnum2の計算結果
 */
class Calculation {
	// @param num1 入力した一つ目の数値
	public double num1;
	// @param num2 入力した二つ目の数値
	public double num2;
	// @param ope 演算子
	public String ope;
	
	public void setNum(double n1, double n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	public void setOperator(String o) {
		this.ope = o;
	}
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
