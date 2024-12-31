/*
 * String型のサンプル
 * 作成：M.Takahashi
 */
class Sample0602 {
	public static void main(String[] args) {

		String name = "河合彩香";	// 名前
		float value = 62.7f;		// 偏差値
		char assess = 'Ａ';			// 評価

		// 文字列の連結（連結演算子を使用）
		String result = name + "さんの偏差値=" + value + "・評価=" + assess;
		
		// 結果の表示
		System.out.println(result);
	}
}
