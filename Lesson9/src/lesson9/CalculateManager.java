package lesson9;

import java.util.Map;
import java.util.HashMap;

/**
 * オプションクラス
 * 
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
	 */
	public CalculateBase getInstance(int operator) {
		return this.CalculateBaseMap.get(operator);
	}
}