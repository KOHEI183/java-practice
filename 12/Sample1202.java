/*
 * switch サンプル（文字列）
 * 作成：M.Takahashi
 */
class Sample1202 {
	public static void main(String[] args) {
		// 文字列入力
		System.out.print("\n好きな食べ物は？ > ");
		String str = new java.util.Scanner(System.in).nextLine();

		// 結果
		switch (str) {
			case "カレー":
				System.out.println("\n" + str + "は、僕も好きです。");
				break;
			case "ラーメン":
				System.out.println("\n" + str + "は、色々な種類がありますね。");
				break;
			default:
				System.out.println("\n" + str + "なんですね。");
		}
	}
}
