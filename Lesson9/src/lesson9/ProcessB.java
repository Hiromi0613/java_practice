package lesson9;

/**
 * PersonalBクラス
 * Processインターフェースを実装
 */
public class ProcessB implements Process {
	/**
	 * checkメソッド
	 * 引数name,ageをpersonalクラスに格納する
	 * name,ageが条件に合うか判断する
	 * @param name 名前
	 * @param age 年齢
	 * @return boolean型の戻り値を返す
	 */
	public boolean check(String name, int age) {
		if((name.length() >= 5 && name.length() <= 20) && (age >= 30 && age <= 60)) {
			return true;	
		} else {
			return false;
		}
	}
	
	/**
	 * runメソッド
	 * 出力する
	 */
	public void run(String name, int age) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);	
	}
}