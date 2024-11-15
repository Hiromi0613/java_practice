package lesson9;

/**
 * InputDateクラス
 */
public class InputDate {
	/** 数値１ */
	private int x;
	/** 数値２ */
	private int y;
	
	/**
	 * 受け取ったint型の引数を変数xに代入する
	 * @param x　数値１
	 */
	public void setNum1(int x) {
		this.x = x;
	}
	
	/**
	 * 受け取ったint型の引数を変数yに代入する
	 * @param y　数値２
	 */
	public void setNum2(int y) {
		this.y = y;
	}
	
	/**
	 * 変数xを戻り値として返す
	 * @return　数値１
	 */
	public int getNum1() {
		return x;
	}
	
	/**
	 * 変数yを戻り値として返す
	 * @return　数値２
	 */
	public int getNum2() {
		return y;
	}
}