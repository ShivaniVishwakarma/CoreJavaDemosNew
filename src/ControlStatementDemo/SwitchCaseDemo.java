package src.ControlStatementDemo;

public class SwitchCaseDemo {

int day;
	
	public void dayColor(int day)
	{
		switch (day) {
		case 1 : System.out.println("Monday is for white");
				break;
		case 2 : System.out.println("Tuesday is for yellow");
				break;
		case 3 : System.out.println("Wednesday is for red");
				break;
		case 4 : System.out.println("Thursday is for green");
				break;
		case 5 : System.out.println("Friday is for pink");
				break;
		case 6 : System.out.println("Saturday is for purple");
				break;
		case 7 : System.out.println("Sunday is for blue");
				break;
		default: System.out.println("You can wear black");
				break;
		}
	}
}
