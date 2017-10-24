
public class PairOfDice {
	private NumberCube die1;
	private NumberCube die2;
	
	public PairOfDice() {
		die1 = new NumberCube();
		die2 = new NumberCube();
	}
	
	public int roll() {
		return die1.roll() + die2.roll();
	}
}
