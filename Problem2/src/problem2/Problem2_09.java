//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差(x-y)、積、商と余り (x÷y)、を表示するプログラムを作成してください。

package problem2;

class Problem2_09
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 7;
		
		System.out.println("xとyの和は" + (x+y) + "です。");
		System.out.println("xとyの差は" + (x-y) + "です。");
		System.out.println("xとyの積は" + (x*y) + "です。");
		System.out.println("xとyの商は" + (x/y) + "で、余りが" + (x%y) + "です。");
	}
	 
}