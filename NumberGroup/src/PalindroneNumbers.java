
public class PalindroneNumbers implements NumberGroup {
	
	
	@Override
	public boolean contains(int value) {
		String original = "" + value;
		String backwards = "";
		
		for(int i = original.length() - 1; i >= 0; i--) {
			backwards += original.substring(i, i + 1); //stop positon, i + 1, not included in the string
		}
		return original.equals(backwards);
		
	}

}
