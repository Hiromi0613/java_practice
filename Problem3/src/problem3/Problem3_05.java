/*正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成してください。
* ※偶数、奇数の判定には除算の余りを利用する。
*/

package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem3_05
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if((res%2) == 0) {
			System.out.println("偶数");
			}
		else {
			System.out.println("奇数");
		}
	}
}