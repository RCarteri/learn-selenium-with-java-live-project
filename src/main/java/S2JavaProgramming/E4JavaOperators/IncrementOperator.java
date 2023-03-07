package S2JavaProgramming.E4JavaOperators;

public class IncrementOperator {

	public static void main(String[] args) {
		
		//  ++  is called increment operator  -->   pre, post
		
		int a=10;
		
		// scenario 1 - there is no difference between pre/post increment
		
		//a++;   //a=a+1;   // post increment
		//++a;  // pre-increment
			
		//System.out.println(a);  //11

		
		//scenario -2
		
		int res=a++;
		
		
		//int res=++a;
		
		System.out.println(res); //10   11
		System.out.println(a);
		
		
	}

}
