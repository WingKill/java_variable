
class IntegerLiterals {
	public static void main(String[] args) {
		int num1 = 123; 			// 10진수 표현
		int num2 = 0123; 			//  8진수 표현
		int num3 = 0x123;			// 16진수 표현 // 123456789ABCDEF
		byte seven = 0B111;			//  2진수 표현
		int num205 = 0B11001101;	//  2진수 표현

		int num4 = 100_000_000;		// _문법도 제공
		int num5 = 12_34_56_78_90;	// _문법도 제공(자바 전용)

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("seven : " + seven);
		System.out.println("num205 : " + num205);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		System.out.println("11 + 22 + 33 = " + (11+22+33));
		System.out.println("011 + 022 + 033 = " + (011+022+033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11+0x22+0x33));
		
		System.out.println(3222222222L + 3444444444L);
	}		
}
