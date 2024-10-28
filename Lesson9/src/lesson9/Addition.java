package lesson9;

/**
 * Additionクラス
 * CalculateBaseインターフェースを実装
 */
public class Addition implements CalculateBase {
	/** 数値１ */
	private int x;
	/** 数値２ */
	private int y;
	
	/**
	 * calculateメソッド
	 * 二つの値の足し算を行う
	 * @param x 数値１
	 * @param y 数値２
	 * @return 計算結果
	 */
	public int calculate(int x, int y) {
		this.x = x;
		this.y = y;
		
		return  x + y;
	}
	
	/**
	 * showメソッド
	 * 計算結果を出力
	 * @param result 計算結果
	 */
	public void show(int result) {
		System.out.println(x + "+" + y + "=" + result);
	}
}