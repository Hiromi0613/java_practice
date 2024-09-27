package test5;

/**
 * @getTotalPrice 金額から税込み価格を計算
 */
class Item {
	// @param Name 商品名
	public String Name;
	// @param price 金額
	public double price;
	// @param tax　消費税率（１０％）
	public final double tax = 0.1;
	
	public void setName(String n) {
		this.Name = n;
	}
	public void setPrice(double p) {
		this.price = p;
	}
	public String getItemName() {
		return Name;
	}
	public double getTotalPrice() {
		return price + price * tax;
	}
	
}