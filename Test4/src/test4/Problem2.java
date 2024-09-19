package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 商品と単価、支払金額を3回入力し、支払金額の不足有無を出力してください。 最後に不足の合計を出力してください。
 * ※入力値はString配列に格納すること。
 * ※数値の計算はStringから変換を行うこと。
 * 
 * 出力例）
 * ＞商品を入力してください。
 * ハンドクリーム
 * ＞単価を入力してください。
 * 3000
 * ＞支払金額を入力してください。
 * 3000
 * ＞商品を入力してください。
 * ボディソープ
 * ＞単価を入力してください。
 * 1500
 * ＞支払金額を入力してください。
 * 1000
 * ・
 * ・
 * ハンドクリーム、3000円、支払金額過不足無し
 * ボディソープ、1500円、支払金額不足
 * ・
 * ・
 * 全体の不足金：1000円
 */
public class Problem2 {
	
	/**
	 * ３つの商品の商品名、単価、支払金額を入力し、商品ごとに商品名、単価、支払金額の不足有無を出力する。
	 * その後、支払金額不足の合計を出力する。
	 * @param args 実行引数
	 */
	public static void main(String[] args)throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String[][] List = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("商品を入力してください。");
			String str1 = br.readLine();
	        List[0][i] = str1;
	        
	        System.out.println("単価を入力してください。");
	        String str2 = br.readLine();
	        List[1][i] = str2;
	        
	        System.out.println("支払金額を入力してください。");
	        String str3 = br.readLine();
	        List[2][i] = str3;
		}
		// @param sum 不足金額の合計
		int sum = 0;
		
		for(int j = 0; j < 3; j++) {
			// @param price 単価
			int price = Integer.parseInt(List[1][j]);
			// @param pay 支払金額
			int pay = Integer.parseInt(List[2][j]);
			
			if(price <= pay) {
				System.out.println(List[0][j] + "、" + List[1][j] + "、支払金額過不足無し");
			}
			else {
				System.out.println(List[0][j] + "、" + List[1][j] + "、支払金額不足");
				sum = sum + (price - pay);
			}
		}
		System.out.println("全体の不足金：" + sum + "円");
	}
}