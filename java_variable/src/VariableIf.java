
class VariableIf {

	public static void main(String[] args) {
//		int num1 = 5;
//		int num2 = 7;
//		
//		if(num1 < num2) {
//			System.out.println("제일 큰 수는 num2 : " + num2 +"입니다.");
//		}else if(num1 > num2) {
//			System.out.println("제일 큰 수는 num1 : " + num1 +"입니다.");
//		}else {
//			System.out.println("두 수의 값은 같습니다.");
//		}
//		
////		if(num1 - num2 >= 0) {
////			System.out.println("제일 큰 수는 " + num1 +"입니다.");
////		}else {
////			System.out.println("제일 큰 수는 " + num2 +"입니다.");
////		}
//		
//		int result;
//		
//		result = (num1>num2)?num1:num2; // 삼항 연산자
//
//		System.out.println(result);
//		
//		int n = 1;
//		//스위치 케이스
//		switch (n) {
//		case 1:
//			System.out.println("Simple Java");
//			break;
//		case 2:
//			System.out.println("Funny Java");
//			break;
//		case 3:	
//			System.out.println("Fantastic Java");
//			break;
//		default:
//			System.out.println("The Best programming Java");
//		}
//		
//		System.out.println("Do you like Java?");

		int month = 13;
		
		switch (month) {
		case 1:
			System.out.println("겨울입니다.");
			break;
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
			System.out.println("봄입니다.");
			break;
		case 4:
			System.out.println("봄입니다.");
			break;
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
			System.out.println("여름입니다.");
			break;
		case 7:
			System.out.println("여름입니다.");
			break;
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
			System.out.println("가을입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
			System.out.println("겨울입니다.");
			break;			
		default:
			System.out.println("잘못 입력된 달입니다.");
			break;
		}
		
		switch (month) {
		case 12: case 1 : case 2:
			System.out.println("겨울입니다.");
			break;
		case 3: case 4 : case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7 : case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10 : case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못 입력됐다니까요?");
			break;
		}
		
		
//		int n = 0;
//		
//		if(month<=0 || month>12) {
//			System.out.println("제대로 입력되지 않았습니다. 1월로 자동 입력됩니다.");
//			month = 1;
//		}
//		
//		if(month == 12 || month == 1 || month == 2) {
//			n = 1;
//		}else if(month >= 3 && month <= 5) {
//			n = 2;
//		}else if(month >= 6 && month <= 8) {
//			n = 3;
//		}else {
//			n = 4;
//		}
//		
//		switch (n) {
//		case 1:
//			System.out.println("겨울입니다.");
//			break;
//		case 2:
//			System.out.println("봄입니다.");
//			break;
//		case 3:
//			System.out.println("여름입니다.");
//			break;
//		case 4:
//			System.out.println("가을입니다.");
//			break;
//		}
		
	}

}
