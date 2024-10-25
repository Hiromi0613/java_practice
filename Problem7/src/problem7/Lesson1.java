package problem7;

/**
 * 以下条件を満たし、指定した文言を出力してください。
 * ①条件：Stringに代入する値は「山田 太郎」としてください。
 * ②条件：条件①の変数を使って出力してください。
 * 
 * 出力例）
 * 私の名前は山田です。
 */
public class Lesson1 {
	public static void main(String[] args) {
		String str = "山田　太郎";
		
		StringBuffer sb = new StringBuffer(str);
		sb.deleteCharAt(2);
		sb.deleteCharAt(2);
		sb.deleteCharAt(2);
		
		System.out.println("私の名前は" + sb + "です。");
	}
}