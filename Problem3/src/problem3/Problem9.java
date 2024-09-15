package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 150円のドリンクがあります。投入金額を入力し、おつりがあるかどうかを判定してください。
 */
public class Problem9 {
	public static void main(String[] args)throws IOException {
		System.out.println("投入金額を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res > 150) {
			System.out.println((res - 150) + "円のおつりがあります。");
		}
		else if(res == 150) {
			System.out.println("おつりはありません。");
		}
		else {
			System.out.println("投入金額が" + (150 - res) + "円不足しています。");
		}
	}
}