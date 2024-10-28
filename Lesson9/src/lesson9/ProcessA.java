package lesson9;

/**
 * PersonalAクラス
 * Processインターフェースを実装
 */
public class ProcessA implements Process {	
	/** 名前 */
	String name;
	/** 年齢 */
	int age;
	
	/**
	 * checkメソッド
	 * 引数name,ageをpersonalクラスに格納する
	 * name,ageが条件に合うか判断する
	 * @param name 名前
	 * @param age 年齢
	 * @return boolean型の戻り値を返す
	 */
	public boolean check(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(name.length() < 10 && (age >= 0 && age <= 140)) {
			return true;	
		} else {
			return false;
		}
	}
	
	/**
	 * runメソッド
	 * 出力する
	 */
	public void run() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}