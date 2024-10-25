package test9;

interface Process {
	abstract void check(String name, int age);
	abstract void run();
}

/**
 * PersonalAクラス
 * Processインターフェースを実装
 */
public class ProcessA implements Process {	
	Personal personal = new Personal();
	
	/**
	 * checkメソッド
	 * 引数name,ageをpersonalクラスに格納する
	 * name,ageが条件に合うか判断する
	 * @param name 名前
	 * @param age 年齢
	 */
	public void check(String name, int age) {	
		personal.setName(name);
		personal.setAge(age);
		
		String checkName = personal.getName();
		int checkAge = personal.getAge();
		
		if(checkName.length() < 10 && (checkAge >= 0 && checkAge <= 140)) {
			return;	
		} else {
			System.exit(0);
		}
	}
	
	/**
	 * runメソッド
	 * 出力する
	 */
	public void run() {
		System.out.println("私の名前は" + personal.getName() + "です。年齢は" + personal.getAge() + "です。");
	}
}