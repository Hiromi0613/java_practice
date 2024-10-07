package test6ver2;														
														
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
 * 入力した情報をPersonalInfクラスに渡し、戻り値を出力する
 */
public class Problem2 {										
        /**														
         * 入力した情報を人物ごとに表示する														
         * @param args 実行引数														
         */														
	public static void main(String[] args) {
		String[][] List;
		List = new String[4][3];
		
		List[0][0] = "山田";
		List[0][1] = "鈴木";
		List[0][2] = "田中";
		List[1][0] = "２６";
		List[1][1] = "３３";
		List[1][2] = "４１";
		List[2][0] = "東京大田区大森";
		List[2][1] = "和歌山県和歌山市";
		List[2][2] = "宮城県仙台市";
		List[3][0] = "090-0000-0000";
		List[3][1] = "090-1111-2222";
		List[3][2] = "090-3333-4444";
		
		PersonalInf[] personalInf = new PersonalInf[3];
		
		personalInf[0] = new PersonalInf();
		personalInf[1] = new PersonalInf();
		personalInf[2] = new PersonalInf();
		
		personalInf[0].setName(List[0][0]);
		personalInf[0].setAge(List[1][0]);
		personalInf[0].setAddress(List[2][0]);
		personalInf[0].setTelNum(List[3][0]);
		
		personalInf[1].setName(List[0][1]);
		personalInf[1].setAge(List[1][1]);
		personalInf[1].setAddress(List[2][1]);
		personalInf[1].setTelNum(List[3][1]);
		
		personalInf[2].setName(List[0][2]);
		personalInf[2].setAge(List[1][2]);
		personalInf[2].setAddress(List[2][2]);
		personalInf[2].setTelNum(List[3][2]);
				
		for(int i = 0; i < 3; i++) {		
			System.out.println("私の名前は" + personalInf[i].getName() + "です。年齢は" + personalInf[i].getAge() + "です。住所は" + personalInf[i].getAddress() + "です。電話番号は" + personalInf[i].getTelnum() + "です。");
		}	
	}														
}
						