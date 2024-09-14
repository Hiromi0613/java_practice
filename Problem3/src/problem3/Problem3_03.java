/*int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には「x は y より大きい」、
 * x が y より小さい場合には「x は y より小さい」と表示するプログラムを作成してください。
 */

package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem3_03
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
			System.out.println(x + "は" + y + "より大きい");
		}
		else if(x<y) {
			System.out.println(x + "は" + y + "より小さい");
		}
	}
}