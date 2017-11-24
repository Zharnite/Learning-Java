
public class Sound {
	private int[] samples;
	
	public Sound(int[] theSamples) {
		samples = theSamples;
	}
	
	public int limitAmplitude(int limit) {
		int numChanges = 0;
		for(int i = 0; i < samples.length; i++) {
			if(samples[i] > limit) {
				samples[i] = limit;
				numChanges++;
			}
			else if(samples[i] < -limit) {
				samples[i] = -limit;
				numChanges++;
			}
		}
		return numChanges;
	}
	
	public String toString() {
		String output = "";
		for(int s : samples) {
			output += s + ", ";
		}
		return output + "\n";
	}
	
	public void trimSilenceFromBeginning() {
		int leadingZeros = 0;
		while(samples[leadingZeros] == 0) {
			leadingZeros++;
		}
		int[] temp = new int[samples.length - leadingZeros];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = samples[i + leadingZeros];
		}
		samples = temp;
	}
	
	public void trimSilenceFromEnd() {
		int endingZeros = 0;
		while(samples[samples.length - 1 - endingZeros] == 0) {
			endingZeros++;
		}
		int[] temp = new int[samples.length - endingZeros];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = samples[i];
			
		}
		samples = temp;
	}
	
}
