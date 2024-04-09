package src.ControlStatementDemo;

public class JumpingStatementsDemo {

	public static void main(String[] args) {

		// Use of continue
		System.out.println("Use of continue keyword - Printing all values except 5 : ");

		// Problem: to print all values except 5

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}
		
		// Use of break
				System.out.println("Use of break keyword - Printing all values till 5 comes : ");

				// Problem: Printing all values till 5 comes

				for (int i = 0; i < 10; i++) {
					if (i == 5) {
						break;
					}
					System.out.println(i);

				}

	}

}
