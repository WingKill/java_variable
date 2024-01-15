
class Constants {
	public static void main(String[] args) {
		/*변수와 상수의 차이*/
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		System.out.println(3147483647L + 3147483648L);
		CONST_ASSIGNED = 12; 
		
		// MAX_SIZE = 200; // 상수에 다시 값을 넣어 초기화시키려 하면 에러가 난다.
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		
		final double PI = 3.14;
		
		double redius = 10.5;		
		double regArea = PI * redius * redius;
		
		System.out.println("원의 넓이 : " + regArea);
	}
}
