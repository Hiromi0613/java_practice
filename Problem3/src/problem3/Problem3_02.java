//２つの整数値を入力し、大きい方の数を表示するプログラムを作成してください。

package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem3_02
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		if(x>y) {
			System.out.println(x);
		}
		else if(x<y) {
			System.out.println(y);
		}
	}
}