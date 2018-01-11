
public class AnyGivenNumber implements NumberGroup {
	private int[] numbers;
	
	public AnyGivenNumber(int[] numbers) {
		this.numbers = numbers;
	}
	@Override
	public boolean contains(int value) {
		for(int num : numbers) {
			if(num == value) {
				return true;
			}
		}
		return false;
	}

}
