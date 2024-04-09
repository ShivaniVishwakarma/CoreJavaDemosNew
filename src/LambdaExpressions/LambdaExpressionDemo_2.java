package src.LambdaExpressions;

public class LambdaExpressionDemo_2 {

	public static void main(String[] args) {
		
		Sayable s1= () -> {
			return "I have nothing to say";
		};
		System.out.println(s1.say());
		
		
		String name = "Shivani";
		Sayable s2= () -> {
			return ("Hello " + name);
		};
		System.out.println(s2.say());
				
	}
	
}
