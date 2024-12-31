/*
 * do-while サンプル
 * 作成：M.Takahashi
 */
class Sample1502 {
	public static void main(String[] args) {
		/*
		 * exit が入力されるまで繰り返す。
		 * proc1 は処理１、proc2 は処理２ 
		 */
		// 入力文字列
		String input;
		// do - while 文
		do {
			// 入力を受け付ける
			System.out.print("\n処理1=proc1,処理2=proc2,終了=exit > ");
			input = new java.util.Scanner(System.in).nextLine();

			// 処理の振分け
			switch (input) {
				case "proc1":
					System.out.println("\n処理1 を行いました。");
					break;
				case "proc2":
					System.out.println("\n処理2 を行いました。");
					break;
				case "exit":
					System.out.println("\nありがとうございました。");
					break;
				default:
					System.out.println("\n入力文字列をご確認ください。");
			}
		} while (!input.equals("exit"));
	}
}
