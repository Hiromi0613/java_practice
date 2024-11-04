package test10;

/**
 * Personalクラス
 */
public class Personal {
	/** 名前 */
	String name;
	/** 年齢 */
	int age;
	
	/**
	 * 受け取ったString型の引数を変数nameに代入する
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 受け取ったint型の引数を変数ageにする
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 変数nameを戻り値として返す
	 * @return　名前
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 変数ageを戻り値として返す
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}
}