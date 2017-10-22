import java.util.Scanner;

public class GuessingGame {

	
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int replay = 1;
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
		
		while(replay == 1) {
			
			
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
			replay = 2;
			while(replay != 1 && replay != 0) {
				System.out.print("Play the level again? Enter the number \"1\" to play again: ");
				replay = inputScanner.nextInt();
				if (replay == 1) {
					int[] temp = new int[scoreHistory.length + 1];
					for(int i = 0; i < scoreHistory.length; i++) {
						temp[i] = scoreHistory[i];
					}
					scoreHistory = temp;
					
				}
				if(replay == 0) {
					printArr(scoreHistory);
					System.out.println("Congratulations for playing!");
					for(int i = 0; i < scoreHistory.length; i++) {
						System.out.println("Game " + (i + 1) + ": " + scoreHistory[i] + " guesses.");
					}
				}
				
			}
		}
	}
	
	public static void printArr(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	
}