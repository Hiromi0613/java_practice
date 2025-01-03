package test10;

/**
 * PersonalAクラス
 * ProcessBaseインターフェースを実装
 */
public class ProcessA implements ProcessBase {
	/**
	 * checkメソッド
	 * 引数name,ageをpersonalクラスに格納する
	 * name,ageが条件に合うか判断する
	 * @param name 名前
	 * @param age 年齢
	 * @throws CustomException 条件に適さない場合の例外処理
	 */
	public void check(String name, int age) throws CustomException {
		if(!(name.length() < 10 && age >= 0 && age <= 140)) {
			throw new CustomException("名前と年齢を正しく入力してください。");
		}
	}
	
	/**
	 * runメソッド
	 * 出力する
	 * @param name 　名前
	 * @param age　年齢
	 */
	public void run(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}