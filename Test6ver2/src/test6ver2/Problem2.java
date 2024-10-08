package test6ver2;		

import java.util.List;
import java.util.ArrayList;
														
/**														
*以下条件を満たしたクラスを作成し、指定した文言を出力してください。														
*														
*①条件：インスタンス変数にはprivateを指定してください。														
*②条件：コンストラクタで初期化可能としてください。														
*③条件：名前、年齢、住所、電話番号はインスタンス変数の値を出力してください。														
*④条件：年齢はStringでもintでも設定可能なSetterを用意してください。														
*⑤条件：インスタンスは複数newし、Listをループして出力してください。														
*														
*出力例）														
*私の名前は山田です。年齢は26歳です。住所は東京大田区大森です。電話番号は090-0000-0000です。														
*私の名前は鈴木です。年齢は33歳です。住所は和歌山県和歌山市です。電話番号は090-1111-2222です。														
*私の名前は田中です。年齢は41歳です。住所は宮城県仙台市です。電話番号は090-3333-4444です。														
*/	

/**
 * 入力した情報をPersonalクラスに渡し、戻り値を出力する
 */
public class Problem2 {										
        /**														
         * 入力した情報を人物ごとに表示する														
         * @param args 実行引数														
         */														
	public static void main(String[] args) {
		Personal yamada = new Personal("山田","２６","東京大田区大森","090-0000-0000");
		Personal suzuki = new Personal("鈴木","33","和歌山県和歌山市","090-1111-2222");
		Personal tanaka = new Personal("田中","４１","宮城県仙台市","090-3333-4444");
		
		List<Personal> list = new ArrayList<Personal>();
		
		list.add(yamada);
		list.add(suzuki);
		list.add(tanaka);
		
				
		for(int i = 0; i < 3; i++) {		
			System.out.println("私の名前は" + list.get(i).getName() + "です。年齢は" + list.get(i).getAge() + "です。住所は" + list.get(i).getAddress() + "です。電話番号は" + list.get(i).getTelnum() + "です。");
		}	
	}														
}
						