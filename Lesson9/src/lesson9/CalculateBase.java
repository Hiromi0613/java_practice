package lesson9;

/**
 * CalculateBaseインターフェース
 */
public interface CalculateBase {
	/**
	 * calculatteメソッド
	 * @param x　数値１
	 * @param y　数値２
	 * @return 計算結果
	 */
	int calculate(int x, int y);
	
	/**
	 * showメソッド
	 * @param x 数値１
	 * @param y 数値２
	 * @param 計算結果
	 */
	void show(int x, int y, int result);
}