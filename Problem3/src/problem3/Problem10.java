package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 性別と年齢を入力し、下記の条件で生命保険料を算出してください。
 * 
 * 男性
 * 80歳以上：8000円
 * 50歳以上：7000円
 * 30歳以上：5000円
 * 女性
 * 80歳以上：7000円
 * 50歳以上：6000円
 * 30歳以上：4500円
 */
public class Problem10 {
	public static void main(String[] args)throws IOException {
		System.out.println("性別と年齢を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int res2 = Integer.parseInt(str2);
		
		if((str1 == "男") && (res2 >=80)) {
			System.out.println("8000円");
		}
		else if((str1 == "男") && ((res2 >=50) && (res2 < 80))) {
			System.out.println("７０００円");
		}
		else if((str1 == "男") && ((res2 >=30) && (res2 < 50))) {
			System.out.println("５０００円");
		}
		else if((str1 == "女") && (res2 >=80)) {
			System.out.println("７０００円");
		}
		else if((str1 == "女") && ((res2 >=50) && (res2 < 80))) {
			System.out.println("６０００円");
		}
		else if((str1 == "女") && ((res2 >=30) && (res2 < 50))) {
			System.out.println("５０００円");
		}
		else {
			System.out.println("正しく入力してください。");
		}
	}
}