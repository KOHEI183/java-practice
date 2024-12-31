/*
 * 明示的な型変換サンプル
 * 作成：M.Takahashi
 */
class Sample0802 {
	public static void main(String[] args) {
		// 定数・変数の宣言と初期化
		final double TAX_RATE = 1.08;	// 税率
		int price = 20;					// 定価

		// 掛け算の結果を int型変数に代入
		int result = (int) (price * TAX_RATE);
//		int result = (int) price * TAX_RATE;
		System.out.println("result：" + result);
	}
}
