package src.LambdaExpressions;

public class AdditionDemo {

	public static void main(String[] args) {

		// CASE : 1

		Addition d1 = (a, b) -> (a + b);
		{
			System.out.println("Case 1 Sum is " + d1.add(10, 20));
		}
		;

		// CASE : 2 --> Without using Braces

		Addition d2 = (a, b) -> (a + b);
		System.out.println("Case 2 Sum is " + d2.add(100, 200));

		// CASE : 3 --> using data type in parameter

		Addition d3 = (int a, int b) -> (a + b);
		System.out.println("Case 3 Sum is " + d3.add(1000, 2000));

		// CASE : 4 -->Using return statement

		Addition d4 = (a, b) -> {
			return (a + b);
		};
		System.out.println("Case 4 Sum is " + d4.add(10000, 20000));

	}// Main ends

}
