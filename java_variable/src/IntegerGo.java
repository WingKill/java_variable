
class IntegerGo {

	public static void main(String[] args) {
//		int num = - 10;
//		
//		if(num >= 0) {
//			System.out.println(num);
//		}else {
//			System.out.println(-num);
//		}
		int a = -80;
		int b = 33;
		int c = 55;
		int m;
		
		if((a>b) && (a>c)) {
			m = a;
		}else if((b>a) && (b>c)) {
			m = b;
		}else {
			m = c;
		}
		System.out.println(m);
		m = (a>b) ? ((a>c)? a : c) : ((b>c)? b : c);
		System.out.println(m);
		m = (a>b && a>c) ? a : ((b>a && b>c) ? b : c);
		System.out.println(m);
		
		
//		System.out.println(m);
//		
//		m = (a>b&&a>c)? a : ((b>a&& b>c)? b : c);
//		
//		System.out.println(m);
//		
//		if(m < a) {
//			m = a;
//		}else if(m < b) {
//			m = b;
//		}else {
//			m = c;
//		}
//		System.out.println(m);
//		
	}
}
