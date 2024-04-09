package src.ControlStatementDemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("........IF-Else Demo..........");
		IfElseDemo i = new IfElseDemo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= s.nextInt();
		i.marry(age);
		System.out.println();
		
		System.out.println("........Switch Case Demo..........");
		SwitchCaseDemo d=new SwitchCaseDemo();
		int dayNo;
		System.out.println("Enter a day number: ");
		dayNo=s.nextInt();
		d.dayColor(dayNo);
		
	}
}

