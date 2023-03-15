package S2JavaProgramming.E5JavaConditionalStatements;


/*
a>b and a>c   a is largest
b>a and b>c   b is largest
c>a and c>b  c is largest
*/

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=300, b=1000, c=500;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number:" + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number:"+ b);
		}
		else
		{
			System.out.println("c is largest number:" + c);
		}
		
	}

}
