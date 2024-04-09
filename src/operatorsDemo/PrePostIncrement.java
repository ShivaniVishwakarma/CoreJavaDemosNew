package src.operatorsDemo;

public class PrePostIncrement {

	public static void main(String[] args) {
		
		int i=100;
		System.out.println("Original: " + i);
		
		int b=i++; // First assign and then increase
		
		System.out.println("After i++ (post-increment) i= " + i);
		System.out.println("After i++ (post-increment) b= " + b);
		
		int c=++i;
		System.out.println("After ++i (pre-increment) i= " + i);
		System.out.println("After ++i (pre-increment) c= " + c);
	}
}
