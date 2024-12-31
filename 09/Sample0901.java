/*
 * 配列サンプル
 * 作成：M.Takahashi
 */
class Sample0901 {
	public static void main(String[] args) {
		// 商品名配列
		String[] item = new String[3];
		item[0] = "ボールペン";
		item[1] = "ノート";
		item[2] = "付箋紙";

//		String[] item = {"ボールペン", "ノート", "付箋紙"};

		// 価格配列
		int[] price = { 75, 80, 95 };

		// 表示
		System.out.println(item[0] + "：" + price[0] + "円");
		System.out.println(item[1] + "：" + price[1] + "円");
		System.out.println(item[2] + "：" + price[2] + "円");
		System.out.println("----");
		System.out.println("商品数：" + item.length);
	}
}
