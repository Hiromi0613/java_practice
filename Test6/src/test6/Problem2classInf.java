package test6;

/**
 * 名前、年齢、住所、電話番号の引数を受け取り、元のクラスに戻す
 */
class Inf {														
	/** 名前 */ 														
	private String name;														
	/** 年齢 */														
	private int age;														
	/** 住所 */														
	private String address;														
	/** 電話番号 */														
	private String telnum;	
	
	/** 初期化する */
	public Inf() {
		name = null;														
		age = 0;														
		address = null;														
		telnum = null;														
	}

	/**
	 * setNameメソッド
	 * 受け取った名前の引数を変数nameに代入する
	 * @param n 名前の引数
	 */
	public void setName(String n) {														
		this.name = n;														
	}

	/**
	 * setAgeメソッド
	 * 受け取ったint型の年齢の引数を変数ageに代入する
	 * @param ai 年齢の引数
	 */
	public void setAge(int ai) {														
		this.age = ai;														
	}

　　　　/**
	 * setAgeメソッド
	 * 受け取ったstring型の年齢の引数を変数ageに代入する
	 * @param as 年齢の引数
	 */														
	public void setAge(String as) {														
		int agei = Integer.parseInt(as);														
		this.age = agei;														
	}	

	/**
	 * setAddressメソッド
	 * 受け取った住所の引数を変数Addressに代入する
	 * @param ad 住所の引数
	 */												
	public void setAddress(String ad) {														
		this.address = ad;														
	}	

	/**
	 * setTelnumメソッド
	 * 受け取った電話番号の引数を変数telnumに代入する
	 * @param t 電話番号の引数
	 */													
	public void setTelnum(String t) {														
		this.telnum = t;														
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
	 * String型の変数telnumを返す
	 * @return　変数telnum
	 */																										
	public String getTelnum() {														
		return telnum;														
	}														
}																						
