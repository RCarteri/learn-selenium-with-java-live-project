package S2JavaProgramming.E4JavaOperators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//   var=exp ? result1 : result2;
		
		//Example 1
		int a=200, b=100;
		
		int x= a>b ? a : b;
		
		System.out.println(x); //200
		
		
		//Example 2
		a=1000;
		b=2000;
			
		
		x=b<a? b: a;
		
		System.out.println(x);  
		
		
		//Example4
		x=(1==1)?100:200;
		
		System.out.println(x);//100
		
		
		//Example5
		
		int age=18;
		
		String res= (age>=18) ? "Eligible for vote" : "Not Eligible for vote";
		
		System.out.println(res);
		
		

	}

}
