/*
 * ŠÖŒW‰‰Zq‚ÌƒTƒ“ƒvƒ‹
 * ì¬FM.Takahashi
 */
class Sample0704 {
	public static void main(String[] args) {
		// •Ï”éŒ¾E‰Šú‰»
		int a = 5;
		int b = 5;
		int c = 3;
		
		//y<z
		boolean result1 = (a < b);					// false
		System.out.println("result1F" + result1);

		//y>z
		boolean result2 = (a > c);					// true
		System.out.println("result2F" + result2);

		//y<=z
		boolean result3 = (a <= b);					// true
		System.out.println("result3F" + result3);
		boolean result4 = (a <= c);					// false
		System.out.println("result4F" + result4);

		//y>=z
		boolean result5 = (a >= b);					// true
		System.out.println("result5F" + result5);
		boolean result6 = (a >= c);					// true
		System.out.println("result6F" + result6);

		//y==z
		boolean result7 = (a == b);					// true
		System.out.println("result7F" + result7);
		boolean result8 = (a == c);					// false
		System.out.println("result8F" + result8);

		//y!=z
		boolean result9 = (a != b);					// false
		System.out.println("result9F" + result9);
		boolean result10 = (a != c);				// true
		System.out.println("result10F" + result10);
	}
}
