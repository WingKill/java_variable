
class EscapeSequences {
	public static void main(String[] args) {
		// 이클립스에서는 예전부터 해당 탈출 문자들에 대한 에러가 있었다.
		System.out.println("AB" + '\b' + 'C'); // 백스페이스
		System.out.println("AB" + '\t' + 'C'); // 탭
		System.out.println("AB" + '\n' + 'C'); // 개행
		System.out.println("AB" + '\r' + 'C'); // 캐리지 리턴(carriage return)
		// 어째서 아직까지 고쳐지지 않았는가. 물론 이클립스 콘솔창 에러일 듯.
		
		int num1 = 50;
		long num2 = 33333333333L;
				
		int num3 = (int)(num1 + num2);
		
		System.out.println(num1 + num2);
		System.out.println(num3);
		
		double pi = 3.1415;
		int number = (int) pi;
		
		short num11 = 1;
		short num22 = 2;
		short num33 = (short)(num11 + num22);
		System.out.println(num33);
	}

}

