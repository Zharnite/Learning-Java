
public class Test1 {
	public static void main(String[] args) {
		int gamesPlayed = 7;
		int[] scoreHistory = new int[gamesPlayed];
		scoreHistory[0] = 5;
		System.out.println(scoreHistory[gamesPlayed - 1]);
		gamesPlayed++;
		System.out.println(gamesPlayed);
		
		int n = gamesPlayed - 1; 
		scoreHistory[n] = 9;
		
		
		
		System.out.println(scoreHistory[gamesPlayed]);
	}
}
