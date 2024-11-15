package lesson9;

import java.util.Map;
import java.util.HashMap;

/**
 * オプションクラス
 */
public class CalculateManager {
	/** カルキュレートベース */
	private Map<Integer, CalculateBase> CalculateBaseMap;
	
	/**
	 * コンストラクタ
	 */
	public CalculateManager() {
		this.CalculateBaseMap = new HashMap<Integer, CalculateBase>();
		this.CalculateBaseMap.put(1, new Addition());
		this.CalculateBaseMap.put(2, new Subtraction());
		this.CalculateBaseMap.put(3, new Division());
		this.CalculateBaseMap.put(4, new Multiplication());
	}
	
	/**
	 * インスタンス取得
	 * @param operator 演算子を割り当てられた値（１～４）
	 * @return　演算子を割り当てられた値毎にCalculateBaseMapに格納されたnew コンストラクタ名
	 */
	public CalculateBase getInstance(int operator) {
		return this.CalculateBaseMap.get(operator);
	}
}