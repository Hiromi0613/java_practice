package test9;

interface CalculateBase {
	abstract void calculate(int x, int y);
	}

public class Computation implements CalculateBase {
	/** 演算子 */
	private int operator;
	/** 一つ目の値 */
	private int x;
	/** 二つ目の値 */
	private int y;
	
	/**
	 * setOperatorメソッド
	 * 受け取ったint型の引数operatorを変数operatorに代入する
	 * @param operator　演算子の引数
	 */
	public void setOperator(int operator) {
		this.operator = operator;
	}
	
	/**
	 * calculateメソッド
	 * 受け取ったint型の引数x,yを変数x,yに代入する
	 * @param x 一つ目の値の引数
	 * @param y 二つ目の値の引数
	 */
	public void calculate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * showメソッド
	 * 変数operatorの値ごとに振り当てられた演算子を使って、
	 * xの値とyの値を計算し、出力する
	 */
	public void show() {
		switch(operator) {
		   case 1:
			   System.out.println(x + "+" + y + "=" + (x + y));
			   break;
		   case 2:
			   System.out.println(x + "-" + y + "=" + (x - y));
			   break;
		   case 3:
			   System.out.println(x + "/" + y + "=" + (x / y));
			   break;   
		   case 4:
			   System.out.println(x + "*" + y + "=" + (x * y));
			   break;
		   default:
			   System.out.println("1〜4の数値を入力してください。");
			   break;
		}
	}
}