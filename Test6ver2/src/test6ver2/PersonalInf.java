package test6ver2;

/**
 * 名前、年齢、住所、電話番号の引数を受け取り、元のクラスに戻す
 */
public class PersonalInf {														
	/** 名前 */ 														
	private String name;														
	/** 年齢 */														
	private int age;														
	/** 住所 */														
	private String address;														
	/** 電話番号 */														
	private String telNum;	
	
	/**
	 * 初期化する
	 */
	public PersonalInf() {
		name = null;														
		age = 0;														
		address = null;														
		telNum = null;														
	}

	/**
	 * setNameメソッド
	 * 受け取った名前の引数を変数nameに代入する
	 * @param name 名前の引数
	 */
	public void setName(String name) {														
		this.name = name;														
	}

	/**
	 * setAgeメソッド
	 * 受け取ったint型の年齢の引数を変数ageに代入する
	 * @param ageInt 年齢の引数
	 */
	public void setAge(int age) {														
		this.age = age;														
	}

	/**
	 * setAgeメソッド
	 * 受け取ったstring型の年齢の引数を変数ageに代入する
	 * @param ageString 年齢の引数
	 */														
	public void setAge(String age) {														
		this.age = Integer.parseInt(age);														
	}	

	/**
	 * setAddressメソッド
	 * 受け取った住所の引数を変数Addressに代入する
	 * @param address 住所の引数
	 */												
	public void setAddress(String address) {														
		this.address = address;														
	}	

	/**
	 * setTelnumメソッド
	 * 受け取った電話番号の引数を変数telNumに代入する
	 * @param telNum 電話番号の引数
	 */													
	public void setTelNum(String telNum) {														
		this.telNum = telNum;														
	}	

	/**
	 * getNameメソッド
	 * String型の変数nameを返す
	 * @return　変数name
	 */												
	public String getName() {														
		return name;														
	}

	/**
	 * getAgeメソッド
	 * int型の変数ageを返す
	 * @return　変数age
	 */													
	public int getAge() {														
		return age;														
	}		

	/**
	 * getAddressメソッド
	 * String型の変数addressを返す
	 * @return　変数address
	 */											
	public String getAddress() {														
		return address;														
	}

	/**
	 * getTelnumメソッド
	 * String型の変数telNumを返す
	 * @return　変数telNum
	 */																										
	public String getTelnum() {														
		return telNum;														
	}														
}