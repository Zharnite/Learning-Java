
public class TestPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean prime51 = Primes.isPrime2(num);
		num = 51;
		System.out.println(num + ": " + prime51);
		num = 97;
		System.out.println(num + ": " +
				Primes.isPrime2(num));
		
		int[] primes = Primes.firstNPrimes(20);
		Primes.printArr(primes);
	}

}
