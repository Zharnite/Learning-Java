
public class FirstFile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String message = "Hello, ";
		String addressee = "World";
		System.out.println(message + addressee);
		addressee = "Zhen";
		System.out.println(message + addressee);
		System.out.println(average(2.2, 5415));
		
		String name = "Zesty Zhen";
		int age = 12;
		System.out.println("Hello, " + name + ".");
		System.out.println("You are " + age + " years old.");
		System.out.println("You will be " + (age + 100) + " in a hundred years.");
		
		int[] values = {5, 2, 9, 1, 11};
		
		int[] otherValues = new int[5];
		otherValues[0] = 5;
		otherValues[4] = 4;
		
		
		double valuesAvg = average(values);
		System.out.println(valuesAvg);
		
		
		
		double[] gpas = new double[10];
		gpas[0] = -10000;
		gpas[1] = -12;
		gpas[2] = -8500.2;
		gpas[3] = -3.999999;
		gpas[4] = -10;
		gpas[5] = -102;
		gpas[6] = -5.1;
		gpas[7] = -0.99;
		gpas[8] = -64.99;
		gpas[9] = -64.99;
		double gpasAvg = average(gpas);
		System.out.println("gpas = " + gpasAvg);
		
		
		double largestNumber = largestNum(gpas);
		System.out.println(largestNumber);
		int largestNumber2 = largestNum(values);
		System.out.println(largestNumber2);
		
		printArr(gpas);
		printArr(values);
	}
	
	public static double average (int num1, int num2) {
		return (double) (num1 + num2)/2;
	}
	public static double average (double num1, double num2) {
		return (num1 + num2)/2;
	}
	public static double average(int[] numbers) {
		//must create a sum
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			 //sum = sum + numbers[i];
			sum += numbers[i];
		}
		return sum / (double)numbers.length;
	}
	public static double average(double[] numbers) {
		//must create a sum
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum / numbers.length;
	}
	public static double largestNum(double[] numbers) {
		double largest = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}
	//precondition: numbers.length > 0
	public static int largestNum(int[] numbers) {
		int largest = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}
	public static void printArr(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		//This makes the next thing printed start at a new line
		System.out.println();
	}
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		//This makes the next thing printed start at a new line
		System.out.println();
	}
}
