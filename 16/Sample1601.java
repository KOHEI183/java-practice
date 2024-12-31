/*
 * Sample1601.java
 * for で配列を扱う サンプル
 * 作成：M.Takahashi
 */
class Sample1601 {
	public static void main(String[] args) {
		/*
		 * 配列に格納された教科名（国語、算数、英語）と
		 * 点数 (83, 77, 91) を「教科名：点数」の形式で表示して
		 * 最後に合計と平均を表示する。平均は int 型
		 */
		// 配列・変数の初期化
		String[] sub = {					// 教科名
			"国語", "算数", "英語", "理科", "社会"
		};
		int[] score = {83, 77, 91, 68, 84};			// 点数
		int total = 0;						// 合計

		// 繰り返し (for - 配列)
		for (int i = 0; i < sub.length; i++) {
			System.out.println(				// 教科・点数表示
				sub[i] + "：" + score[i]
			);
			total += score[i];				// 合計に加算
		}

		// 計算結果の表示
		System.out.println("----");
		System.out.println("合計：" + total);
		System.out.println("平均：" + total / sub.length);
	}
}
