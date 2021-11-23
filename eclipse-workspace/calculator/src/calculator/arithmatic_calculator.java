package calculator;

import java.util.Scanner;

public class arithmatic_calculator {

	public static void main(String[] args) {
		
		
		System.out.println("Arithmatic Calculator");
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Choose the operation to be performed:");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int op = sc.nextInt();
		switch(op)
		{
		case 1: System.out.println(a+b); 
		        break;
		case 2: System.out.println(a-b);
		        break;
		case 3: System.out.println(a*b);
		        break;
		case 4: System.out.println(a/b);
		        break;
		default:break;
		}
			

	}

	

}
