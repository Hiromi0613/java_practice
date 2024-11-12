package lesson9;

import java.util.Map;
import java.util.HashMap;

/**
 * サービスマネージャー
 */
public class ServiceManager {
	/** プロセスマップ */
	private Map<Integer, Process> ProcessMap;
	
	/**
	 * コンストラクタ
	 */
	public ServiceManager() {
		this.ProcessMap = new HashMap<Integer, Process>();
		this.ProcessMap.put(1, new ProcessA());
		this.ProcessMap.put(2, new ProcessB());
	}
	
	/**
	 * インスタンス取得
	 * @param mode　処理モードを割り当てられた値
	 * @return　処理モードを割り当てられた値毎にProcessMapに格納されたnew コンストラクタ名
	 */
	public Process getInstance(int mode) {
		return this.ProcessMap.get(mode);
	}
}