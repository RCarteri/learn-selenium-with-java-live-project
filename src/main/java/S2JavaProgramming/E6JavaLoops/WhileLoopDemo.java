package S2JavaProgramming.E6JavaLoops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//Example 1: print 1....10 numbers
		
		/*int i=1;   // initilization
		
		while(i<=10)  // condition  1  2  3  4 5 6 7 8 9 10
		{
			System.out.println(i);   //1  2 3  4......10
			i++;   // incrementation   //2  3 4  5.......11
		}*/
		
		//Example2: print Hello 10 times..
		
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}*/
		
		
		//Example3: print even numbers between 1---10
		
		//Appraoch1
		/*int i=2;
		
		while(i<=10)
		{
			System.out.println(i); //2
			 i+=2;    //i=i+2;
		}*/
		
		//Appraoch2
		/*int i=1;
		
		while(i<=10)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			i++;
		}
		*/
		//Example 4: Print odd numbers between 1---10
		//Apprach 1
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println(i); 
			 i+=2;   
		}*/
		
		//Approach 2
		
		/*int i=1;
		
		
		while(i<=10)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
			i++;
		}*/
		
		
		//Exampl5: 10.......1
		
		int i=10;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
