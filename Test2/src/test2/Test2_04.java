/*以下処理を実装してください。

int 型の変数 x に数値 7 を代入する。
変数 x の値を 3 倍にする。
変数 x の値を表示する。
変数 x の値を半分(1/2)にする。
変数 x の値を表示する。
*/

package test2;

class Test2_04
{
	public static void main(String[] args)
	{
		int x = 7;
		
		x = x*3;
		
		System.out.println("ｘの値は" + x + "です。");
		
		x = x/2;
		
		System.out.println("ｘの値は" + x + "です。");
	}
}