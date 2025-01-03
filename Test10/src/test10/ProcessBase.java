package test10;

/**
 * ProcessBaseインターフェース
 */
public interface ProcessBase {
	/**
	 * checkメソッド
	 * @param name 名前
	 * @param age　年齢
	 * @throws CustomException 独自の例外処理
	 */
	void check(String name, int age)throws CustomException;
	
	/**
	 * runメソッド
	 * @param name 　名前
	 * @param age　年齢
	 */
	void run(String name, int age);
}