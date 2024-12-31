/*
 * StringŒ^‚ÌŒ^•ÏŠ·ƒTƒ“ƒvƒ‹
 * ì¬FM.Takahashi
 */
class Sample0803 {
	public static void main(String[] args) {
		// •¶š—ñËintŒ^
		System.out.print("intŒ^‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
		String a = new java.util.Scanner(System.in).nextLine();
		int b = Integer.parseInt(a);

		// •¶š—ñËdoubleŒ^
		System.out.print("doubleŒ^‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
		String c = new java.util.Scanner(System.in).nextLine();
		double d = Double.parseDouble(c);

		// Š|‚¯Z‚ÌŒ‹‰Ê‚Ì•\¦
		System.out.println("\n("+ b + "~" + d + ")‚ÌŒ‹‰Ê‚Í\t" + b * d);

		// ”’l(intEdouble)Ë•¶š—ñ‚Ì•ÏŠ·
		String bStr = String.valueOf(b);
		String dStr = String.valueOf(d);
		System.out.println("\n•¶š—ñ•ÏŠ·E˜AŒ‹Œã\t"+ bStr + dStr);
	}
}
