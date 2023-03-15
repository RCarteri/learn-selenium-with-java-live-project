package S2JavaProgramming.E5JavaConditionalStatements;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		int weekno=1;
		
		switch(weekno)
		{
		case 1: System.out.println("Sunday");
				break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday");break;
		case 4 : System.out.println("Wednessday"); break;
		case 5 : System.out.println("Thursday"); break;
		case 6 : System.out.println("Friday"); break;
		case 7 : System.out.println("Saturday"); break;
		default: System.out.println("Invalid week number");
		
		}

	}

}
