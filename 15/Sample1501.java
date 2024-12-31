/*
 * for文の中でif文を使う（制御構文のネスト）
 * 作成：M.Takahashi
 */
class Sample1501 {
	public static void main(String[] args) {
		/*
		 *  0 ～ 9 まで順に表示。
		 *	3の倍数の時には"(3の倍数)"と付加する。
		 */
		for (int i = 0; i < 10; i++) {
			if ((i % 3) == 0) {
				System.out.println(i + "(3の倍数)");
			} else {
				System.out.println(i);
			}
		} 
	}
}
