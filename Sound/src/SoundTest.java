
public class SoundTest {

	public static void main(String[] args) {
		int[] values = {0,0,25,300,-400,26,0,-555,16,333,0,0,0};
		Sound sound1 = new Sound(values);
		System.out.println(sound1);
		int changes = sound1.limitAmplitude(200);
		System.out.println("Number of changes made: " + changes);
		System.out.println(sound1);
		sound1.trimSilenceFromBeginning();
		System.out.println(sound1);
		sound1.trimSilenceFromEnd();
		System.out.println(sound1);
	}

}
