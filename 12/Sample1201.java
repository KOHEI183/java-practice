/*
 * switch �T���v�� int�^
 * �쐬�FM.Takahashi
 */
class Sample1201 {
	public static void main(String[] args) {
		// �N��敪����
		System.out.print("\n12�Έȏ�=1, 6�Έȏ�E12�Ζ���=2, 6�Ζ���=3 > ");
		String str = new java.util.Scanner(System.in).nextLine();
		int div = Integer.parseInt(str);

		// ���i�\��
		switch (div) {
			case 1:
				System.out.println("\n2000�~�ł��B");
				break;
			case 2:
				System.out.println("\n1000�~�ł��B");
				break;
			case 3:
				System.out.println("\n0�~�ł��B");
				break;
			default:
				System.out.println("\n�w�肳�ꂽ�敪���Ԉ���Ă��܂��B");
		}
/*
		if (div == 1) {
			System.out.println("\n2000�~�ł��B");
		} else if (div == 2) {
			System.out.println("\n1000�~�ł��B");
		} else if (div == 3) {
			System.out.println("\n0�~�ł��B");
		} else {
			System.out.println("\n�w�肳�ꂽ�敪���Ԉ���Ă��܂��B");
		}
*/
	}
}
