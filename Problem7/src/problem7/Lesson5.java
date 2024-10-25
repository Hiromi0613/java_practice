package problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*以下条件を満たし、指定した文言を出力してください。
*①条件：name、ageを持つPersonクラスを作成してください。
*②条件：以下のオブジェクトをListに追加してください。
*{ name: 山田 太郎, age: 18}
*{ name: 鈴木 哲夫, age: 34}
*{ name: 高橋 花子, age: 29}
*{ name: 佐藤 美咲, age: 42}
*{ name: 中村 和大, age: 22}
*③条件：入力した2つの数値の間の年齢の人の名前を出力してください。
*④条件：for文を使用せずに実装してください。
*
*出力例)
*20
*30
*20〜30歳の人は
*高橋 花子
*中村 和大
*です。
*/
public class Lesson5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[][] List;
		List = new String[5][2];
		
		List[0][0] = "山田 太郎";
		List[1][0] = "鈴木 哲夫";
		List[2][0] = "高橋 花子";
		List[3][0] = "佐藤 美咲";
		List[4][0] = "中村 和大";
		List[0][1] = "18";
		List[1][1] = "34";
		List[2][1] = "29";
		List[3][1] = "42";
		List[4][1] = "22";
		
		Person yamada = new Person();
		Person suzuki = new Person();
		Person takahashi = new Person();
		Person satou = new Person();
		Person nakamura = new Person();
		
		yamada.setName(List[0][0]);
		yamada.setAge(List[0][1]);
		suzuki.setName(List[1][0]);
		suzuki.setAge(List[1][1]);
		takahashi.setName(List[2][0]);
		takahashi.setAge(List[2][1]);
		satou.setName(List[3][0]);
		satou.setAge(List[3][1]);
		nakamura.setName(List[4][0]);
		nakamura.setAge(List[4][1]);
		
		int YamadaAge = yamada.getAge();
		int SuzukiAge = suzuki.getAge();
		int TakahashiAge = takahashi.getAge();
		int SatouAge = satou.getAge();
		int NakamuraAge = nakamura.getAge();
		
		System.out.println("２つの数値を入力してください。");
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);
		
		System.out.println(res1 + "～" + res2 + "歳の人は");
		
		if(YamadaAge >= res1 && YamadaAge <= res2) {
			System.out.println(yamada.getName());
		} 
		
		if(SuzukiAge >= res1 && SuzukiAge <= res2) {
			System.out.println(suzuki.getName());
		}
		
		if(TakahashiAge >= res1 && TakahashiAge <= res2) {
			System.out.println(takahashi.getName());
		} 
		
		if(SatouAge >= res1 && SatouAge <= res2) {
			System.out.println(satou.getName());
		} 
		
		if(NakamuraAge >= res1 && NakamuraAge <= res2) {
			System.out.println(nakamura.getName());
		} 
	}
}
