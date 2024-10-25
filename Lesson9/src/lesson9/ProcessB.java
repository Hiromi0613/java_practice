package lesson9;

public class ProcessB implements Process {
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
		
		if((checkName.length() >= 5 && checkName.length() <= 20) && (checkAge >= 30 && checkAge <= 60)) {
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
		System.out.println("名前：" + personal.getName() );
		System.out.println("年齢：" + personal.getAge());	
	}
}