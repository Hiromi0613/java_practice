package test10;

/**
 * 独自の例外処理
 * Exceptionを継承
 */
public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * コンストラクタ
	 * エラーメッセージを受け取る
	 * @param msg　エラーメッセージ
	 */
	public CustomException(String msg) {
		super(msg);
	}
}
