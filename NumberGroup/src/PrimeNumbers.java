
public class PrimeNumbers implements NumberGroup {

	@Override
	public boolean contains(int value) {
		if(value == 2) 
			return true;
		if(value < 2) 
			return false;
		//if(value % 2 == 0) 
		if(new EvenNumbers().contains(value))
			return false;
		
		int divisor = 3;
		int maxTest = (int)(Math.sqrt(value));
		while(divisor <= maxTest) {
			if(value % divisor == 0) 
				return false;
			
			divisor += 2;
		}
		return true;
	}

}
