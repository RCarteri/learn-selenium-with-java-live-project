package S2JavaProgramming.E16Collections.JavaProgrammingExamples;
public class NumberOfDigits {

	public static void main(String[] args) {
		
		int count = 0;
		int num = 3452;

        while(num != 0)
        {
            num /= 10;  // 345  34  3
            ++count;
        }

        System.out.println("Number of digits: " + count);
		

	}

}
