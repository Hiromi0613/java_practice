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
 * 商品名と金額を入力し、金額を税込み価格に変換後、商品名と購入額を出力する
 */
public class Problem1 {
	/**
	 * mainメソッド
	 * 入力した引数をitemメソッドに渡して結果を出力する
	 * @param args 実行引数
	 * @throws IOException　例外処理
	 */
	public static void main(String[] args)throws IOException {
		Item item1 = new Item();
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("商品名を入力してください。");
		
		String str1 = br.readLine();
		
		System.out.println("金額を入力してください。");
		
		String str2 = br.readLine();
		int res = Integer.parseInt(str2);
		
		item1.setName(str1);
		item1.setPrice(res);
		
		String itemName = item1.getItemName();
		
		double totalPrice = item1.getTotalPrice();
		int totalPriceInt = (int)totalPrice;
		
		System.out.println("購入額：" + totalPriceInt + "円");
		
	}
}
