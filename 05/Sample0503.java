/*
 * 変数・定数のサンプル
 * 作成：M.Takahashi
 */
class Sample0503 {
	public static void main(String[] args) {

		final int PERFECT_SCORE = 100;	// 満点

		int myScore = 72;		// 変数（得点）の宣言・初期化

//		PERFECT_SCORE = 200;	// 再度、代入できない

		// 成績情報の表示
		System.out.println("満点=" + PERFECT_SCORE);
		System.out.println("得点=" + myScore);
	}
}
