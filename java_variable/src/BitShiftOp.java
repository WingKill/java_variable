
class BitShiftOp {
	public static void main(String[] args) {	
		byte num;
		
		num = 2; // 00000010
		System.out.print((byte)(num << 1)+ " "); // 00000100
		System.out.print((byte)(num << 2)+ " "); // 00001000
		System.out.println((byte)(num << 3)+ " "); // 00010000
		
		num = 8; // 00001000
		System.out.print((byte)(num >> 1)+ " "); // 00000100
		System.out.print((byte)(num >> 2)+ " "); // 00000010
		System.out.println((byte)(num >> 3)+ " "); // 00000001

		num = -8; // 11111000
		System.out.print((byte)(num >> 1)+ " "); // 11111100
		System.out.print((byte)(num >> 2)+ " "); // 11111110
		System.out.println((byte)(num >> 3)+ " "); // 11111111
		
		
//		int num1 = 10, num2 = 20, num3 = 30; // 
//		num1 = num2 = num3; // 
//		//		= 연산자의 결합 방향은 오른쪽에서 왼쪽으로 진행된다. 
//		//		num1 = (num2 = num3);
//		System.out.println(num1); 
// 		System.out.println(num2); 
//		System.out.println(num3);
//		  
//		int num1 = 0; 
//		int num2 = 0; 
//		boolean result; 
//		 
//		num1 += 10; //
//		num2 += 10; 
//		result = (num1 < 0) && (num2 > 0); // //
//		System.out.println("result = " + result); // false //
//		System.out.println("num1 = " + num1); // 10 
//		System.out.println("num2 = " + num2 + '\n'); // 10 
//		 
//		num1 += 10; 
//		num2 += 10; 
//		result = (num1 > 0)|| (num2 > 0); // 
//		System.out.println("result = " + result); // true //
//		System.out.println("num1 = " + num1); // 20 
//		System.out.println("num2 = " + num2); // 20
		 		
//		int n1 = 5;
//		int n2 = 7;
//		
//		if(n1>n2) {
//			System.out.println("n1>n2 is true");
//		}
//		
//		if(n1 == n2) {
//			System.out.println("n1 == n2 is true");
//		}else {
//			System.out.println("n1 == n2 is false");
//		}
	}
}

