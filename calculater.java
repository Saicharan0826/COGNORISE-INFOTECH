package com.cogno;
import java.util.Scanner;
public class calculater {
public static void main(String[] args){
	System.out.println(" ");
	Scanner sc=new Scanner(System.in);
	
	System.out.print("👉👉👉Enter the first number: ");
	double num1=sc.nextDouble();
	System.out.print("👉👉👉Enter the second number: ");
	double num2=sc.nextDouble();
	  
	System.out.println("👉👉👉 Enter an Arithematic Operator");
	System.out.print(" (+)  , (-) ,(*) , (/) ,exit");
	System.out.println(" ");
	char operator=sc.next().charAt(0);
	double result = 0;

	switch(operator) {
	case '+':
		
		result=num1+num2;
		System.out.print(" Addition of two numbers are: " +result);
		break;
	
	case '-':
		result=num1-num2;
		System.out.print("Substraction of two numbers are: " +result);
		break;
	case '*':
		result=num1*num2;
		System.out.print(" Multiply of two numbers are: " +result);
		break;
		
	case '/':
		try {
		result=num1/num2;
		System.out.print(" division of two numbers are: " +result);
		break;
		}
	catch (ArithmeticException e) {
	
		System.out.println("Second  number that means Denominator cannot be zero...");
	
	}
	default:System.out.println("Invalid operator....");
		
}
}
}
