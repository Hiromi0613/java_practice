package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Practice7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("０から１０までの整数を入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res >= 0 && res <= 10) {
			System.out.println("正解です。");	
		}
		else {
			System.out.println("まちがいです。");
		}
	}
}