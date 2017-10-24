
public class TestDice {

	public static void main(String[] args) {
		
		//NumberCube myCube = new NumberCube(); 
		//if there is no constructor, an empty NumberCube constructor will be made
		PairOfDice myDice = new PairOfDice();
		int count = 0;
		while(count < 30) {
			System.out.print(myDice.roll() + ",");
			count++;
		}
		
		
		
	}

}
