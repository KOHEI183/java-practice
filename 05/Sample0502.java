/*
 * 変数のサンプル２
 * 作成：M.Takahashi
 */
class Sample0502 {
	public static void main(String[] args) {

		int age;				// 変数の宣言
		age = 20;				// 変数への値の代入

		age = 24;				// 上書き

		int height = 173;		// 変数の宣言と代入（初期化）

		int thisAge = age;		// 変数から変数へ代入
		int nextAge = age + 1;	// 計算結果の代入

		// 剛留くん情報の表示
		System.out.print("剛留くん：年齢=" + thisAge + "歳");
		System.out.print("・身長=" + height + "cm");
		System.out.println("・来年の年齢=" + nextAge + "歳");
	}
}
