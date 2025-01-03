package test10;

/**
 * PersonalAクラス
 * ProcessBaseインターフェースを実装
 */
public class ProcessB implements ProcessBase {
	/**
	 * checkメソッド
	 * 引数name,ageをpersonalクラスに格納する
	 * name,ageが条件に合うか判断する
	 * @param name 名前
	 * @param age 年齢
	 * @throws CustomException 条件に適さない場合の例外処理
	 */
	public void check(String name, int age)throws CustomException {
		if(!(name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60)) {
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
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);	
	}
}