package S2JavaProgramming.E4JavaOperators;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//1) Arithmetic operators   + - * / % 
		
		int a=20, b=10;
		
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division a and b is:"+(a%b));

		//2) Relational/comparison operators  >  >=  <  <=  !=  == 
		// return true/false ( boolean)
		
		System.out.println(a>b); // true
		System.out.println(a<b); // false
		
		b=20;
		
		System.out.println(a>=b); // true
		System.out.println(a<=b); // true
		
		System.out.println(a!=b); // false
		
		System.out.println(a==b); // true
		
		
		//3) Logical operators   &&   ||  !
		// Works between 2 or more boolean values
		// returns true/false
		
		boolean x=true;
		boolean y=false;
				
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		
		boolean b1=10>20;   //false
		boolean b2=20>10;   //true
		
		System.out.println(b1 && b2);  //false
		System.out.println(b1 || b2);  //true
			
		
	}

}





