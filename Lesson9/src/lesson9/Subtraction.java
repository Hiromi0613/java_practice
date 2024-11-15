package lesson9;

/**
 * Subtractionクラス
 * CalculateBaseインターフェースを実装
 */
public class Subtraction implements CalculateBase {
	/**
	 * calculateメソッド
	 * xからyを引く
	 * @param x 数値１
	 * @param y 数値２
	 * @return 計算結果
	 */
	public int calculate(int x, int y) {
		return  x - y;
	}
	
	/**
	 * showメソッド
	 * 計算結果を出力
	 * @param x 数値１
	 * @param y 数値２
	 * @param result 計算結果
	 */
	public void show(int x, int y, int result) {
		System.out.println(x + "-" + y + "=" + result);
	}
}