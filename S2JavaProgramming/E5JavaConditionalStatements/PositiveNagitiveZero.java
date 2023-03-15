package S2JavaProgramming.E5JavaConditionalStatements;

import java.util.Scanner;

public class PositiveNagitiveZero {

	public static void main(String[] args) {
		
		//int num=0;
				
		// taking the input from user... Ignore for now.. Later I will explain
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
				
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Number is Nagitive");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}

}
