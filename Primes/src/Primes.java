
public class Primes {
	public static boolean isPrime(int num) {
		//boolean store = true;
		if(num == 2) {
			return true;
		}
		if(num < 2) {
			return false;
		}
		if(num % 2 == 0) {
			return false;
		}
		int divisor = 3;
		while(divisor < num) {
			if(num % divisor == 0) {
				return false;
			}
			divisor += 2;
		}
		return true;
		
		/*
		for (int i = 3; i < num; i += 2) {
			if(num % i == 0) {
				store = false;
			}
		}
		return store;
		*/
		
		
	}
	public static boolean isPrime2(int num) {
		if(num == 2) {
			return true;
		}
		if(num < 2) {
			return false;
		}
		if(num % 2 == 0) {
			return false;
		}
		int divisor = 3;
		int maxTest = (int)(Math.sqrt(num));
		while(divisor <= maxTest) {
			if(num % divisor == 0) {
				return false;
			}
			divisor += 2;
		}
		return true;
	}
	
	//precondition: n > 0
	public static int[] firstNPrimes(int n) {
		int[] primes = new int[n];
		
		int count = 0;
		int value =  2;
		while(count < n) {
			if(isPrime2(value)) {
				primes[count] = value;
				count++;
			}
			value++;
		}
		return primes;
	}
	
	public static void printArr(int[] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if(i != num.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}






