package src.ArrayDemo;

public class AnonymousArrayDemo {
	
	public static int sum(int[] a)
	{
		int ans=0;
		for (int i : a) {
			ans=ans+i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		//Using anonymous/nameless array
		
		System.out.println("Sum of numbers is : " + sum(new int[] {1,2,3}));

	}

}
