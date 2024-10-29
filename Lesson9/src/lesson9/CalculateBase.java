package lesson9;

/**
 * CalculateBaseインターフェース
 */
public interface CalculateBase {
	/**
	 * calculatteメソッド
	 * @param x　一つ目の値の引数
	 * @param y　二つ目の値の引数
	 * @return 計算結果
	 */
	int calculate(int x, int y);
	
	/**
	 * showメソッド
	 * @param 計算結果
	 */
	void show(int x, int y, int result);
}