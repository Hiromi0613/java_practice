package test5;

/**
 * 商品名と金額の引数を受け取り、金額に消費税を足し、結果を元のクラスに戻す
 */
class Item {
	/**　商品名　*/
	public String Name;
	/**　金額　*/
	public int price;
	/**　消費税率（１０％）　*/
	public final double tax = 0.1;

	/**
	 * setNumメソッド
	 * 受け取ったString型の引数nを変数Nameに代入する
	 * @param n　商品名の引数
	 */
	public void setName(String n) {
		this.Name = n;
	}
	
	/**
	 * setPriceメソッド
	 * 受け取ったint型の引数pを変数priceに代入する
	 * @param p　金額の引数
	 */
	public void setPrice(int p) {
		this.price = p;
	}
	
	/**
	 * getItemNameメソッド
	 * String型の変数Nameを返す
	 * @return　変数Name
	 */
	public String getItemName() {
		return Name;
	}
	
	/**
	 * getTotalPriceメソッド
	 * 金額に消費税を足して返す
	 * @return　税込み価格
	 */
	public double getTotalPrice() {
		return price + price * tax;
	}
	
}
