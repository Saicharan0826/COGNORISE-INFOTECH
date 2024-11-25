package com.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangamanGame {
	    public static void main(String[] args) {
	    	
	        String[] words = {"java", "code", "game", "hangman"};
	        Random random = new Random();
	        String word = words[random.nextInt(words.length)];
	        char[] display = new char[word.length()];
	        Arrays.fill(display, '_');
	        int incorrectGuesses = 0;
	        int maxAttempts = 6;
	        boolean won = false;

	        Scanner scanner = new Scanner(System.in);

	        String s="WellCome to the Hangaman Game";
	    	for(int i=0;i<s.length();i++)
	    	{
	    		try {
	    			System.out.print(s.charAt(i));
	    			Thread.sleep(300);
	    		} catch (InterruptedException e) {
	    	
	    			e.printStackTrace();
	    		}
	    	}

	        while (incorrectGuesses < maxAttempts && !won) {
	            System.out.println("\nWord: " + String.valueOf(display));
	            System.out.print("Guess a letter: ");
	            char guess = scanner.next().toLowerCase().charAt(0);

	            
	            boolean correct = false;
	            for (int i = 0; i < word.length(); i++) {
	                if (word.charAt(i) == guess) {
	                    display[i] = guess;
	                    correct = true;
	                }
	            }

	            if (!correct) {
	                incorrectGuesses++;
	                System.out.println("Incorrect! You have " + (maxAttempts - incorrectGuesses) + " attempts left.");
	            }

	            
	            if (String.valueOf(display).equals(word)) {
	                won = true;
	            }
	        }        
	        if (won) {
	            System.out.println("\nCongratulations! You guessed the word: " + word);
	        } else {
	            System.out.println("\nGame over! The word was: " + word);
	        }

	
	    }
	}

