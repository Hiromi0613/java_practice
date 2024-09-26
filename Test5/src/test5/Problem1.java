package test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 商品名、金額と消費税率をフィールドに持つ商品クラスを作成してください。
* 商品名と金額を入力し、計算結果を出力してください。
* 消費税率は一律10%です。 ※出力はmainメソッドで行うこと。 出力例）
* 
* 商品名を入力してください。
* 本
* 金額を入力してください。
* 500
* 購入額：510円
*/

/**
 * @param itemName 商品名
 * @param price 金額
 * @param tax　消費税率（１０％）
 * @getTotalPrice 金額から税込み価格を計算
 */
class Item {
	String itemName;
	double price;
	double tax = 0.1;
	
	void setItemNamePrice(String n, double p) {
		itemName = n;
		price = p;
	}
	String getItemName() {
		return itemName;
	}
	double getTotalPrice() {
		return price + price * tax;
	}
	
}

/**
 * 商品名と金額を入力し、金額を税込み価格に変換後、商品名と購入額を出力する
 * @param args 実行引数
 */
public class Problem1 {
	public static void main(String[] args)throws IOException {
		Item item1 = new Item();
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("商品名を入力してください。");
		
		String str1 = br.readLine();
		
		System.out.println("金額を入力してください。");
		
		String str2 = br.readLine();
		double res = Integer.parseInt(str2);
		
		item1.setItemNamePrice(str1, res);
		
		item1.getItemName();
		
		double totalPrice = item1.getTotalPrice();
		int totalPriceInt = (int)totalPrice;
		
		System.out.println("購入額：" + totalPriceInt + "円");
		
	}
}