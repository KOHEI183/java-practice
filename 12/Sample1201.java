/*
 * switch サンプル int型
 * 作成：M.Takahashi
 */
class Sample1201 {
	public static void main(String[] args) {
		// 年齢区分入力
		System.out.print("\n12歳以上=1, 6歳以上・12歳未満=2, 6歳未満=3 > ");
		String str = new java.util.Scanner(System.in).nextLine();
		int div = Integer.parseInt(str);

		// 価格表示
		switch (div) {
			case 1:
				System.out.println("\n2000円です。");
				break;
			case 2:
				System.out.println("\n1000円です。");
				break;
			case 3:
				System.out.println("\n0円です。");
				break;
			default:
				System.out.println("\n指定された区分が間違っています。");
		}
/*
		if (div == 1) {
			System.out.println("\n2000円です。");
		} else if (div == 2) {
			System.out.println("\n1000円です。");
		} else if (div == 3) {
			System.out.println("\n0円です。");
		} else {
			System.out.println("\n指定された区分が間違っています。");
		}
*/
	}
}
