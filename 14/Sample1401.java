/*
 * for サンプル
 * 作成：M.Takahashi
 */
class Sample1401 {
	public static void main(String[] args) {
		/*
		 *  0 ～ 9 まで順に表示して、最後にその合計を表示する
		 */
		// 合計値の初期化
		int total = 0;

		// for ループ
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
			total += i;
		} 

		// 合計の表示
		System.out.println("----");
		System.out.println("合計：" + total);
	}
}
