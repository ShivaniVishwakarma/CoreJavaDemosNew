package src.InheritanceWithAbstractionDemo;

abstract class Employee {

	int empId;
	double salary;
	String name;
	
	public Employee()
	{
		empId=100;
		name="Shivani";
		salary=500000;
	}
		
	public Employee(int id, double sal, String nm) {
		empId = id;
		salary = sal;
		name = nm;
	}

	public void displayDetails()
	{
		System.out.println("Emp name:" + name);
		System.out.println("Emp Id:" + empId);
		System.out.println("Emp Salary:" + salary);
	}
	
	abstract void designationDetails();
	
}
