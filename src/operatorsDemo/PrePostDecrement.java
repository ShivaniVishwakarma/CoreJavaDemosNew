package src.operatorsDemo;

public class PrePostDecrement {

	public static void main(String[] args) {
		int i=100;
		System.out.println("Original: " + i);
		
		int b=i--; // First assign and then decrease
		
		System.out.println("After i-- (post-decrement) i= " + i);
		System.out.println("After i-- (post-decrement) b= " + b);
		
		int c=--i;
		System.out.println("After --i (pre-decrement) i= " + i);
		System.out.println("After --i (pre-decrement) c= " + c);
	}

}
