import java.util.List;
import java.util.ArrayList;

public class Digits {
	
	private ArrayList<Integer> digitList;
	
	public Digits(int num) {
		if(num == 0) {
			digitList.add(0, 0);
		}
		
		int loopTimes = 0;
		int loopNum = 0;
		while(loopNum > 0) {
			loopNum = (loopNum - (loopNum % 10))/10;
			loopTimes++;
		}
		
		int newNum = num;
		for(int i = 0; i < loopTimes; i++) {
			int addNum = newNum % 10;
			digitList.add(0, addNum);
			newNum = (newNum - addNum)/10;
		}
	}
}
