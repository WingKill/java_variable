
class IfTest {

	public static void main(String[] args) {
		int num = -6;
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("6의 배수입니다.");
		}else {
			System.out.println("6의 배수가 아닙니다.");
		}
		
		int kor = 70;
		int eng = 69;
		int math = 95;
		
		int sum = kor + eng + math;
		double arg = (kor + eng + math) / 3.0;
		System.out.println(arg);
		if(arg >= 90) {
			System.out.println("수입니다");
		}else if(arg >= 80) {
			System.out.println("우입니다");
		}else if(arg >= 70) {
			System.out.println("미입니다");
		}else if(arg >= 60) {
			System.out.println("양입니다");
		}else {
			System.out.println("가입니다");
		}
	}

}
