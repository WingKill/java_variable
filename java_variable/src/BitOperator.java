
class BitOperator {
	public static void main(String[] args) {	
		byte n1 = 5;  // 00000101
		byte n2 = 3;  // 00000011
		byte n3 = -1; // 11111111
		
		byte r1 = (byte)(n1 & n2); // 00000001 // 둘 중 하나라도 0이면 0
		byte r2 = (byte)(n1 | n2); // 00000111 // 둘 중 하나라도 1이면 1
		byte r3 = (byte)(n1 ^ n2); // 00000110 // 둘이 같으면 0
		byte r4 = (byte)(~n3);	   // 00000000 // 비트 반전
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}

