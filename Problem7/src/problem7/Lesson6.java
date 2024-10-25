package problem7;

/**
* 以下条件を満たし、指定した文言を出力してください。
* 
* ①条件：name、ageを持つPersonクラスを作成してください。
* ②条件：以下のオブジェクトをListに追加してください。
* { name: 山田 太郎, age: 18}
* { name: 鈴木 哲夫, age: 22}
* { name: 佐藤 美咲, age: 42}
* { name: 高橋 花子, age: 29}
* { name: 中村 和大, age: 22}
* ③条件：以下でソートして出力してください。
* 第一：年齢　昇順
* 第二：名前　昇順
* 
* 出力例）
* 山田 太郎
* 鈴木 哲夫
* 中村 和大
* 高橋 花子
* 佐藤 美咲
*/
public class Lesson6 {
	public static void main(String[] args) {
		String[][] List;
		List = new String[5][2];
		
		List[0][0] = "山田 太郎";
		List[1][0] = "鈴木 哲夫";
		List[2][0] = "中村 和大";
		List[3][0] = "高橋 花子";
		List[4][0] = "佐藤 美咲";
		List[0][1] = "18";
		List[1][1] = "22";
		List[2][1] = "42";
		List[3][1] = "29";
		List[4][1] = "22";
		
		Personal yamada = new Personal();
		Personal suzuki = new Personal();
		Personal nakamura = new Personal();
		Personal takahashi = new Personal();
		Personal satou = new Personal();
		
		yamada.setName(List[0][0]);
		yamada.setAge(List[0][1]);
		suzuki.setName(List[1][0]);
		suzuki.setAge(List[1][1]);
		nakamura.setName(List[2][0]);
		nakamura.setAge(List[2][1]);
		takahashi.setName(List[3][0]);
		takahashi.setAge(List[3][1]);
		satou.setName(List[4][0]);
		satou.setAge(List[4][1]);
		
		for(int i = 0; i > 5; i++) {
			if(List)
		}
	}
}