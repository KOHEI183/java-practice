/*
 * continue サンプル
 * 作成：M.Takahashi
 */
class Sample1702 {
	public static void main(String[] args) {
		/*
		 * 配列の要素を表示する。ただし値がマイナスの要素は除外する
		 */
		// 配列
		int[] array = {10, 0, 5, -1, 9, -2, 3};

		// for ループ
		for (int i = 0; i < array.length; i++) {
			// マイナスの値が見つかったら その回の処理をスキップ
			if (array[i] < 0) {
				continue;
			}
			// 要素の表示
			System.out.println("array["+ i + "]：" + array[i]);
		}
	}
}
