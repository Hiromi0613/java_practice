package test9;

interface CalculateBase {
	abstract void calculate(int x, int y);
	
	abstract void show();
	}

public class Addition implements CalculateBase {
	/** 計算結果 */
	private int result;
	
	Number number = new Number();
	
	/**
	 * calculateメソッド
	 * 二つの値の足し算を行う
	 * @param x 一つ目の値の引数
	 * @param y 二つ目の値の引数
	 */
	public void calculate(int x, int y) {
		number.setNum1(x);
		number.setNum2(y);
		
		this.result = number.getNum1() + number.getNum2();
	}
	
	/**
	 * showメソッド
	 * 計算結果を出力
	 */
	public void show() {
		System.out.println(number.getNum1() + "+" + number.getNum2() + "=" + result);
	}
}