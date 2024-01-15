
class CompAssignOp {
	public static void main(String[] args) {
		short num = 10;
		num =(short) (num + 77L); // 형 변환를 하지 않으면 컴파일 오류 발생
		int rate = 3;
		rate = (int)(rate * 3.5); // 형 변환을 하지 않으면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; // 형 변환 불 필요
		rate = 3;
		rate *= 3.5; // 형 변환 불 필요
		
		System.out.println(num);
		System.out.println(rate);
		
		// 형 변환 유무. 명시적 형 변환을 해야 하는 경우, 할 필요가 없는 경우.
		// 복합 대입 연산자를 쓰는 이유 중 하나.
	}
}
