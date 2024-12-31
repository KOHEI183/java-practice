/*
 * インクリメント演算子・デクリメント演算子のサンプル
 * 作成：M.Takahashi
 */
class Sample0703 {
	public static void main(String[] args) {
		// 変数宣言・初期化
		int a;

		// 後置インクリメント
		a = 5;
		int result1 = a++;
		System.out.println("result1：" + result1);	// 5
		System.out.println("a：" + a);				// 6

		// 前置インクリメント
		a = 5;
		int result2 = ++a;
		System.out.println("result2：" + result2);	// 6
		System.out.println("a：" + a);				// 6
		
		// 後置デクリメント
		a = 5;
		int result3 = a--;
		System.out.println("result3：" + result3);	// 5
		System.out.println("a：" + a);				// 4

		// 前置デクリメント
		a = 5;
		int result4 = --a;
		System.out.println("result4：" + result4);	// 4
		System.out.println("a：" + a);				// 4
	}
}
