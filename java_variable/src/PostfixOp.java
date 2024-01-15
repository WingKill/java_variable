
class PostfixOp {
	public static void main(String[] args) {	
		int num = 5;
		System.out.print(num++ + " ");
		System.out.print(num++ + " ");
		System.out.println(num + " ");
		
		System.out.print(num-- + " ");
		System.out.print(num-- + " ");
		System.out.println(num + " " + '\n');
		
		num = 6;
		System.out.println(++num);
		System.out.println(--num);
		System.out.println(num++);
		System.out.println(num--);
		System.out.println(num);
	}
}

