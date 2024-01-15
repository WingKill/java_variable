
class LogicalOp {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 1 < num1 < 100 인가?
		result = (num1 > 1) && (num1 < 100);
		System.out.println("A는 1 초과 100미만인가? : " + result);
		
		// num2에 저장된 값이 2의 배수 또는 3의 배수인가?
		result = num2 % 2 == 0 || num2 % 3 == 0;
		System.out.println("B는 2 또는 3의 배수인가? : " + result );
		
		// num1 = 0?
		result = !(num1 != 0);
		System.out.println("A는 0인가? : " + result);
		
		int num3 = 100;
		int num4 = 1;
		
		result = (num3 % 2 == 0) && (num4 % 2 == 1);
		System.out.println("100은 짝수이고, 1은 홀수인가? : " + result);
		
	}
}
