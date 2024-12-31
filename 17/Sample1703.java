/*
 * break を使わない サンプル
 * 作成：M.Takahashi
 */
class Sample1703 {
	public static void main(String[] args) {
		/*
		 * 配列の要素を表示する。ただし値がマイナスの要素が見つかったら
		 * その要素以降の処理を行わない。
		 */
		// 配列
		int[] array = {10, 0, 5, -1, 9, -2, 3};

		// for ループ
		System.out.println("----breakを使わないパターン----");
		boolean cont = true;		// 継続フラグをONに
		for (int i = 0; (i < array.length) && cont; i++) {
			// マイナスの値が見つかったら継続フラグをOFFに
			if (array[i] < 0) {
				cont = false;
			} else {
				// 要素の表示
				System.out.println("array["+ i + "]：" + array[i]);
			}
		}
	}
}
