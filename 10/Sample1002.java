/*
 * if - else サンプル（関係演算子・論理演算子）
 * 作成：M.Takahashi
 */
class Sample1002 {
	public static void main(String[] args) {
		// 表示内容
		String result;

		// 年齢入力
		System.out.print("\n年齢を入力してください > ");
		String str = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(str);

		// 表示結果の設定
		if ((20 <= age) && (age < 30)) {
			result = "20代です。";
		} else {
			result = "20代ではありません。";
		}

		// 結果の表示
		System.out.println("\n結果：" + result);
	}
}
