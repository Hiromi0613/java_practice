package test4;

/**
 * 第4章　実力確認問題
 * 
 * 下記の保険契約者の情報を出力してください。
 * 出力の最後に遅延利息が発生している人数を出力してください。
 * ※保険契約者一覧はString配列に格納すること
 * 
 * 【保険契約者一覧】
 * 契約者名	保険料	遅延利息金
 * 中村	5000	2000
 * 田島	3000	
 * 小澤	4500	
 * 大西	6000	3500
 * 出力例）
 * 契約者名:中村、保険料:5000円
 * ・
 * ・
 * 遅延利息金が発生している人数は2人です。
 */
public class Problem1 {
	
	/**
	 * 保険契約者一覧の情報を出力し、遅延利息金が発生している人数を表示する。
	 * @param args 実行引数
	 */
	public static void main(String[] args) {
		//
		String[][] List;
		List = new String[3][4];
		
		List[0][0] = "中村";
		List[0][1] = "田島";
		List[0][2] = "小澤";
		List[0][3] = "大西";
		List[1][0] = "５０００";
		List[1][1] = "３０００";
		List[1][2] = "４５００";
		List[1][3] = "６０００";
		List[2][0] = "２０００";
		List[2][1] = "0";
		List[2][2] = "0";
		List[2][3] = "３５００";
		
		for(int i = 0; i < 4; i++) {
			System.out.println("契約者名：" + List[0][i] + "、保険料：" + List[1][i] + "円");
		}
		
		// 遅延利息金の発生人数
		int sum = 0;
		
		for(int j = 0; j < 4; j++) {
			int num = Integer.parseInt(List[2][j]);
			
			if(num > 0) {
				sum = sum + 1;
			}
		}
		System.out.println("遅延利息金が発生している人数は" + sum + "人です。");
	}
}