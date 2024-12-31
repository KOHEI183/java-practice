/*
 * 多重 ループで 多次元配列を扱う サンプル
 * 作成：M.Takahashi
 */
class Sample1801 {
	public static void main(String[] args) {
		/*
		 * 配列に格納された教科名（国語、算数、英語、理科、社会）と
		 * 点数 (各教科の点数) を「教科名：点数」の形式で表示して
		 * その後に個人別の合計と平均を表示する。平均は int 型
		 * 点数配列は２次元配列として
		 * ３人分(河合さん、速水さん、渕矢さん)のデータを保持する。
		 */
		// 配列・変数の宣言・初期化
		String[] sub = {					// 教科名
			"国語", "算数", "英語", "理科", "社会", "情報"
		};
		String[] person = {					// 受講者
			"河合", "速水", "渕矢"
		};
		int[][] score = {					// 点数
			{83, 77, 91, 68, 84},
			{78, 66, 81, 92, 59, 85},
			{94, 81, 79, 86, 79}
		};
		int total;							// 個人別合計

		// 人数分の for ループ
		for (int i = 0; i < score.length; i++) {
			total = 0;
			System.out.println("\n--【" + person[i] + "さんの得点】--");
			// 教科数分 の for ループ
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(				// 教科・点数表示
					sub[j] + "：" + score[i][j] + " "
				);
				total += score[i][j];			// 合計に加算
			}
			// 合計・平均の表示
			System.out.println("\n合計：" + total);
			System.out.println("平均：" + total / score[i].length);
		}
	}
}
