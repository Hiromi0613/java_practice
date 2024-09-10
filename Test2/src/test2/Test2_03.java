/*int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて
x と y の値を表示するプログラムを作成してください。
*/

package test2;

class Test2_03
{
	public static void main(String[] args)
	{
		int x = 3;
		int y = 5;
        int a =x;
        
		x = y;
		y = a;
		
		System.out.println("xの値は"+ x +"、yの値は"+ y +"です。");
	}
}