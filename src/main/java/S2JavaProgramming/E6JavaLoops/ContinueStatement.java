package S2JavaProgramming.E6JavaLoops;

public class ContinueStatement {

	public static void main(String[] args) {
		

		for(int i=1;i<=10;i++)  
		{
			if(i==3 || i==5)
			{
				continue;
			}
			System.out.println(i);  
		}
		
	}

}
