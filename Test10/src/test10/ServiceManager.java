package test10;

import java.util.HashMap;
import java.util.Map;

/**
 * サービスマネージャー
 */
public class ServiceManager {
	/** プロセスマップ */
	private Map<Integer, ProcessBase> ProcessMap;
	
	/**
	 * コンストラクタ
	 */
	public ServiceManager() {
		this.ProcessMap = new HashMap<Integer, ProcessBase>();
		this.ProcessMap.put(1, new ProcessA());
		this.ProcessMap.put(2, new ProcessB());
	}
	
	/**
	 * インスタンス取得
	 * @param mode　処理モードを割り当てられた値
	 * @return　処理モードを割り当てられた値毎にProcessMapに格納されたnew コンストラクタ名
	 */
	public ProcessBase getinstance(int mode) {
		return this.ProcessMap.get(mode);
	}
}