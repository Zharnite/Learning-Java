import java.util.Scanner;

public class InputPractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Hi " + name + "!");
		System.out.println("You are " + age + " years old.");
		System.out.println("Next year you will be " + (age + 1) + ".");
		*/
		
		int pizzaChoice = 0;
		int errors = 0;
		String msg = "Enter your numeric choice: ";
		while((pizzaChoice < 1 || pizzaChoice > 5) && errors < 3) {
			if(errors == 1) {
				msg = "Invalid choice. Choose again: ";
			}
			if(errors == 2) {
				msg = "Last chance: ";
			}
			System.out.println();
			System.out.println("Pizza menu");
			System.out.println("+++++++++++++++++");
			System.out.println("1. Cheese");
			System.out.println("2. Vegan");
			System.out.println("3. Pineapple");
			System.out.println("4. Pepperoni");
			System.out.println("5. Spinach");
			System.out.println("+++++++++++++++++");
			System.out.print(msg);
			pizzaChoice = scanner.nextInt();
			if(pizzaChoice < 1 || pizzaChoice > 5) {
				errors++;
			}
		}
		if(errors == 3) {
			msg = "No pizza for you!";
		}
		else {
			msg = "You chose pizza " + pizzaChoice;
		}
		System.out.print(msg);
		
	
		
		
		
		
		
	}
	
}
