package lesson9;

/**
 * Divisionクラス
 * CalculateBaseインターフェースを実装
 */
public class Division implements CalculateBase {
	/**
	 * calculateメソッド
	 * xをyで割る
	 * @param x 数値１
	 * @param y 数値２
	 * @return 計算結果
	 */
	public int calculate(int x, int y) {
		return  x / y;
	}
	
	/**
	 * showメソッド
	 * 計算結果を出力
	 * @param result 計算結果
	 */
	public void show(int x, int y, int result) {
		System.out.println(x + "/" + y + "=" + result);
	}
}