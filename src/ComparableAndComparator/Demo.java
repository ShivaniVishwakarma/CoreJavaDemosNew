package src.ComparableAndComparator;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {


		//sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		//sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
		System.out.println();

		//sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

		System.out.println();
		
		//sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

		System.out.println();
		
		//sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));

	}

}
