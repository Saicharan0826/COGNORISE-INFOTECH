package com.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
	
	Random r=new Random();
	int generatedNumber = r.nextInt(100)+1;
	int maxattempts=10;
	int attempts=0;


	String s="WellCome to the Game";
	for(int i=0;i<s.length();i++)
	{
		try {
			System.out.print(s.charAt(i));
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(" ");
	System.out.println("You have to entered the number between 1-100");
	System.out.println("You have "+maxattempts+ " attempts for this game" );
	
	while (attempts < maxattempts) {
        System.out.print("Enter your guess: ");
        Scanner sc=new Scanner(System.in);
        int enternumbers = sc.nextInt();
        attempts++;
        
  if(enternumbers>generatedNumber)
  {
	  System.out.println("Your guessed number is very High 🙁🙁🙁");
	  System.out.println("Please try again...");
	   
  }
   else if(enternumbers<generatedNumber){
	  System.out.println("Your Guessed number is very low 😑😑😑");
	  System.out.println("Please try again.... ");
	
  }
   else
   {
	   
     System.out.println("👌👌👌Congratualions You have find the exact number..😎😎");
     break;
}
   if(attempts==maxattempts) {
	   System.out.println("Sorry Your limits are done 👎👎👎");
	   System.out.println("The correct number is "+generatedNumber);
   }
}
	}
}
