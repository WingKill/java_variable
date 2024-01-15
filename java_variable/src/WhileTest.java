
class WhileTest {
	public static void main(String[] args) {
		int num = 0;
		
		while(num<5) {
			System.out.println("I like Java" + num );
			num++;
		}
		
		num = 0;
		while(num<5) {
			System.out.println("Hello World");
			num++;
		}
		
		num = 1;				// 시작점
		int sum = 0;			// 합계
		int limitValue = 10;	// 최대 범위값
		while(num<=limitValue) {
			sum += num; 
			num++;
		}
		System.out.println(sum);
		
		num = 0;
		
		do {
			System.out.println("Hello World");
			num++;
		}while(num < 5);			
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello World!!!");
		}
		// 1~ 100까지의 합
		sum = 0;
		limitValue = 100;
		for(int i = 1; i <= limitValue; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 5단 뿌리기
		int dan = 5;
		int result = 0;
		for(int i = 1; i <= 9 ; i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
		// 1~100 사이 홀수들의 합
		sum = 0;
		for(int i = 1; i <= limitValue; i++) {
			if(i%2 != 0) {
				sum += i;	
			}			
		}
		System.out.println(sum);
		
		// 100 ~ 1까지 역순으로 나열하기		
		for(int i = 100; i > 0 ; i--) {
			System.out.print(i + " ");		
		}
		System.out.println();
		
		// 100 ~ 1까지 역순으로 짝수만 나열하기
		for(int i = 100; i > 0 ; i -= 2) {
			System.out.print(i+ " ");					
		}		
	}
}
