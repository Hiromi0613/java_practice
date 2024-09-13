package test2;

/**
 * int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて
 * x と y の値を表示するプログラムを作成してください。
 */
public class Test2_03{
	
	/**
	 * ２つの値を設定した後、その値を入れ替えて出力する
	 */
	public static void main(String[] args){
		
		//２つの値を設定
		int x = 3;
		int y = 5;
		//aにｘを置き、xにyを代入した後、ｙにaを代入する
		int a =x;
        
		x = y;
		y = a;
		
		System.out.println("xの値は"+ x +"、yの値は"+ y +"です。");
	}
}