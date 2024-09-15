package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、
 * 不合格を判定するプログラムを作成してください。
 * 両方とも 60 点以上の場合、合格
 * 合計が 130 点以上の場合、合格
 * 合計が 100 点以上で、どちらかの試験が 90 点以上であれば、合格
 * 上記以外は、不合格
 */
public class Problem3_07 {
    
	/**
	 * 整数値を２つ入力し、２つの値によって結果を特定する
	 * @param args　実行因数
	 * @throws IOException 例外処理
	 */
    public static void main(String[] args)throws IOException {
	
	    System.out.println("中間試験と期末試験の点数を入力してください。");
	    
	    BufferedReader br =
	    		new BufferedReader(new InputStreamReader(System.in));
	    
	    //中間試験の点数を入力
	    String str1 = br.readLine();
	    int res1 = Integer.parseInt(str1);
	    
	    //期末試験の点数を入力
	    String str2 = br.readLine();
	    int res2 = Integer.parseInt(str2);
	    
	    if(res1 < 0 || res1 > 100) {
	    	System.out.println("０～１００の数字を入力してください。");
	        }
	    else if(res2 < 0 || res2 > 100) {
	    	System.out.println("０～１００の数字を入力してください。");
        }
	    else if(res1 >= 60 && res2 >= 60) {
	    	System.out.println("合格");
	        }
	    else if((res1 + res2) >= 130) {
	    	System.out.println("合格");
	        }
	    else if((res1 + res2) >= 100 && res1 >= 90) {
	    	System.out.println("合格");
	        }
	    else if((res1 + res2) >= 100 && res2 >= 90) {
	    	System.out.println("合格");
	        }
	    else {
	    	System.out.println("不合格");	
	        }
	}
}