
class TestCoding {

	public static void main(String[] args) {
		int num = 1;	// 숫자
		boolean search = false; // 조건의 참, 거짓 값을 넣어줄 변수
		int x = 100; // 범위 최대값
		int count = 0; // 해당 개수
//		
//		// 처음 만나는 5의 배수이자 7의 배수인 숫자.
//		// 조건문이 진행되는 숫자 범위는 1에서 99까지 될 것이다.
//		while( num < x ) {
//			if(num % 5 == 0 && num % 7 == 0) {
//				search = true; // num이 5의 배수이자 7의 배수인지 아닌지 확인하는 변수에 참 값인 true를 대입 
//				break; // 구문이 나오면 해당 반복문인 while문 탈출. -> 숫자 범위 내에 있지만 break로 인해 반복이 끝난다.
//			}
//			num++;
//		}
//		
//		
//		if(search) {
//			System.out.println("범위 내 첫 5와 배수이자 7의 배수인 숫자 :"+num);
//		}else {
//			System.out.println("5와 배수이자 7의 배수인 숫자가 없습니다.");
//		}
//		
//		search = false;
//		num = 1;
//		x = 1000;
//		// 범위 내 첫 3의 배수이자 5의 배수인 숫자 구하기
//		for(int i = 1 ; i < x; i++ ) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				num = i;
//				search = true;
//				break;
//			}
//		}
//		if(search) {
//			System.out.println("범위 내 첫 3와 배수이자 5의 배수인 숫자 :"+num);
//		}else {
//			System.out.println("해당 범위에 3의 배수이자 5의 배수인 숫자가 없습니다.");
//		}
//		
//		// 5의 배수이고, 7의 배수인 수를 모두 뽑기
//		num = 0; // 숫자
//		count = 0;
//		while((num++) <100) {
//			if((num % 5 != 0 ) || ( num % 7 !=0)) {
//				continue;
//			}
//			count++;
//			System.out.println("5의 배수이자 7의 배수인 숫자 : " + num);
//		}
//		System.out.println("해당 숫자들의 개수 : " + count);
		
		// 3의 배수이자 5의 배수인 숫자의 개수를 구하고, 개수와 해당 숫자들을 모두 출력
		num = 0; // 숫자
		count = 0; // 해당 개수
        x = 1000;
		while((num++) < x) {
			if((num % 3 == 0 ) && ( num % 5 == 0)) {
				count++;
				System.out.println("3의 배수이자 5의 배수인 숫자 : " + num);
			}			
		}
		System.out.println("해당 숫자들의 개수 : " + count);
	}

}
