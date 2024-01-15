
class SCE {
	public static void main(String[] args) {	
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		short num3 = 5;
		System.out.println(+num3);  //   1 * num3
		System.out.println(-num3);  // (-1)* num3
		short num4 = 7;
		short num5 = (short) +num4; //   1 * num4
		short num6 = (short) -num4; // (-1)* num4
		System.out.println(num5);
		System.out.println(num6);
		
		result = ((num1 += 10) < 0) && ((num2 += 10)> 0 );
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + '\n');
		result = ((num1 += 10) > 0) || ((num2 += 10)> 0 );
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);		
	}
}
