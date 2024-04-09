package src.InterfaceDemo;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Call from SBI");
		Sbi s=new Sbi();
		s.deposit();
		s.withdraw();
		s.policy();
		System.out.println("..................");
		
		System.out.println("Call from HDFC");
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdraw();
		h.policy();
		System.out.println("..................");
		
		System.out.println("Call from ICICI");
		Icici i=new Icici();
		i.deposit();
		i.withdraw();
		i.policy();
		System.out.println("..................");
		
		System.out.println("Fixed rate of interest in interface= "+s.rateOfInterest);
		
		System.out.println("..................");
		//For security reasons we create reference of interface instead of reference of class
		//The user will never know what data is in the reference of interface as there is no implementation in it.
		
		System.out.println("Call from refernce of BankInterface using object of ICICI class");
		BankInterface b1 = new Sbi();
		System.out.println("Object b1 is of class : " + b1.getClass().getName());
		b1.withdraw();
		b1.deposit();
		System.out.println("..................");
		
		System.out.println("Call from refernce of BankInterface using object of ICICI class");
		BankInterface b2 = new Hdfc();
		System.out.println("Object b1 is of class : " + b1.getClass().getName());
		b2.withdraw();
		b2.deposit();
	}
	  
}
