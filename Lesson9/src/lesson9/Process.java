package lesson9;

/**
 * Processインターフェース
 */
public interface Process {
	/**
	 * checkメソッド
	 * @param name 名前
	 * @param age　年齢
	 */
	boolean check(String name, int age);
	
	/**
	 * runメソッド
	 * @param name 　名前
	 * @param age　年齢
	 */
	void run(String name, int age);
}