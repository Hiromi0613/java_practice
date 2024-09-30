package test6;

class Inf {														
	//@param name 名前														
	private String name;														
	//@param age 年齢														
	private int age;														
	//@param address 住所														
	private String address;														
	//@param telnum 電話番号														
	private String telnum;	
	
	//初期化する														
	public Inf() {
		name = null;														
		age = 0;														
		address = null;														
		telnum = null;														
	}														
	public void setName(String n) {														
		this.name = n;														
	}														
	public void setAge(int ai) {														
		this.age = ai;														
	}														
	public void setAge(String as) {														
		int agei = Integer.parseInt(as);														
		this.age = agei;														
	}														
	public void setAddress(String ad) {														
		this.address = ad;														
	}														
	public void setTelnum(String t) {														
		this.telnum = t;														
	}														
	public String getName() {														
		return name;														
	}														
	public int getAge() {														
		return age;														
	}														
	public String getAddress() {														
		return address;														
	}														
	public String getTelnum() {														
		return telnum;														
	}														
}																						