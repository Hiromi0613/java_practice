package test5;

/**
 * 商品名と金額の引数を受け取り、金額に消費税を足し、結果を元のクラスに戻す
 */
public class Item {
	/**　商品名　*/
	public String name;
	/**　金額　*/
	public int price;
	/**　消費税率（１０％）　*/
	public final double tax = 0.1;

	/**
	 * setNumメソッド
	 * 受け取ったString型の引数nameを変数nameに代入する
	 * @param name　商品名の引数
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * setPriceメソッド
	 * 受け取ったint型の引数priceを変数priceに代入する
	 * @param price　金額の引数
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * getItemNameメソッド
	 * String型の変数nameを返す
	 * @return　変数name
	 */
	public String getItemName() {
		return name;
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
