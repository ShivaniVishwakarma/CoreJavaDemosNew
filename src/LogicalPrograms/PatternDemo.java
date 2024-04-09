package src.LogicalPrograms;

public class PatternDemo {

	void p1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + j);
			} // inner for ends

			System.out.println("              " + i);
		} // outer for ends

		System.out.println("----------------------------------");
	}// method p1 ends

	void p2() {
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("*");
			} // inner for ends

			System.out.println();
		} // outer for ends
		System.out.println("----------------------------------");
	}// method p1 ends

	void p3() {

		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			} // inner loop for space ends

			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			} // inner loop for * ends
			System.out.println();
		} // outer for ends
		System.out.println("----------------------------------");
	}// method p1 ends

	void p4() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			} // inner for ends

			for (int k = 20; k >= i * 2; k--) {
				System.out.print("*");
			} // inner loop for * ends

			System.out.println();
		} // outer for ends
		System.out.println("----------------------------------");
	}// method p1 ends

}// class ends
