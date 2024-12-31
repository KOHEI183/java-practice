/*
 * if, if-else if-else, 文字列比較 サンプル
 * 作成：M.Takahashi
 */
class Sample1101 {
	public static void main(String[] args) {
		// 【乗車料金】
		// 6歳未満：		0円
		// 6歳以上12歳未満：1000円
		// 12歳以上：		2000円（通常）
		//					1500円（割引券あり）

		// 変数宣言
		int result;			// 価格
		int age;			// 年齢
		String discTicket = null;	// 割引券 ("yes"/"no")

		// 年齢入力
		System.out.print("\n年齢を入力してください > ");
		String ageStr = new java.util.Scanner(System.in).nextLine();
		age = Integer.parseInt(ageStr);

		// 12歳以上の場合のみ処理 (if のみ)
		if (12 <= age) {
			// 割引券の有無の入力
			System.out.print("\n割引券はありますか？ (yes/no) > ");
			discTicket = new java.util.Scanner(System.in).nextLine();
		}

		// 価格の決定 (if - else if ・文字列比較）
		if (age < 6) {
			result = 0;
		} else if (age < 12) {
			result = 1000;
		} else if (discTicket.equals("yes")) {
			result = 1500;
		} else {
			result = 2000;
		}

		// 料金の表示
		System.out.println("\n料金：" + result + "円");
	}
}
