import java.util.Scanner;

public class GuessingGamev0 {

	
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int level = 0;
		
		int[] scoreHistory = new int[1];
		
		System.out.println("Guessing Game");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Levels List");
		System.out.println("Level 1: Beginner (numbers between 1 and 10)");
		System.out.println("Level 2: Intermediate (numbers between 1 and 100)");
		System.out.println("Level 3: Advanced (numbers between 1 and 1,000)");
		System.out.println("Level 4: Expert (numbers between 1 and 10,000)");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		while(level < 1 || level > 4) {
			System.out.print("Enter the level you want to play: ");
			level = (int)inputScanner.nextInt();
		}
		
		
			
			
		System.out.println("The number is between 1.0 and " + Math.pow(10, level)); 
		int target = (int)(Math.random() * Math.pow(10, level)) + 1;
		int gameScore = 0;
		int guess = 0;
		
		String rangeHint = "";
		while(target != guess) {
			if(guess > target && gameScore != 0) {
				rangeHint = "Your number is too high. ";
			}
			else if(guess < target && gameScore != 0) {
				rangeHint = "Your number is too low. ";
			}
			System.out.print(rangeHint + "Guess a number: ");
			guess = (int)inputScanner.nextInt();
			gameScore++;
			
			scoreHistory[scoreHistory.length - 1] = gameScore;
		}
		System.out.println("Nice! It took you " + gameScore + " guess(es) to guess the number " + target + ".");
	}
		
	}
	

	
	
