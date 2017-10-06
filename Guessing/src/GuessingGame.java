import java.util.Scanner;

public class GuessingGame {

	
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int replay = 1;
		int level = 0;
		int gamesPlayed = 0;
		int[] scoreHistory = new int[50];
		
		
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
		
		while(replay == 1) {
			gamesPlayed++;
			if(gamesPlayed > 40) {
				System.out.println("You should probably stop now.");
			}
			System.out.println("The number is between 1 and " + (int)Math.pow(10, level)); 
			int target = (int)(Math.random() * Math.pow(10, level)) + 1;
			int counter = 0;
			int guess = 0;
			int gameScore = 0;
			
			String rangeHint = "";
			while(target != guess) {
				gameScore++;
				
				if(guess > target && counter != 0) {
					rangeHint = "Your number is too high. ";
				}
				else if(guess < target && counter != 0) {
					rangeHint = "Your number is too low. ";
				}
				System.out.print(rangeHint + "Guess a number: ");
				guess = (int)inputScanner.nextInt();
				counter++;
			}
			
			scoreHistory[gamesPlayed - 1] = gameScore;
			
			System.out.println("Nice! It took you " + counter + " guess(es) to guess the number " + target + ".");
			replay = 2;
			while(replay != 1 && replay != 0) {
				
				
				System.out.println("Play the level again?"); 
				System.out.println("Enter the number \"1\" to play again. Enter the number \"0\" to end the game and see your scores: ");
				replay = inputScanner.nextInt();
				if(replay == 0) {
					System.out.print("Your scores are ");
					printArr(scoreHistory);
				}
			}
			
		}
		
	}
	
	public static void printArr(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			int nonZero = 0;
			if(numbers[i] != 0) {
				nonZero++;
				System.out.print(numbers[i]);
			
				if(i < nonZero && i != 0) {
					System.out.print(", ");
				}
				else {
					System.out.print(".");
					
				}
			}
		}
		System.out.println();
	}
	
	
}