import java.util.List;

public class MultipleGroups implements NumberGroup {
	private List<NumberGroup> groupList;
	public MultipleGroups(List<NumberGroup> groupList) {
		this.groupList = groupList;
	}
	@Override
	public boolean contains(int value) {
		/*
		for(int i = 0; i < groupList.size(); i++) {
			if(groupList.get(i).contains(value)) {
				return true;
			}
		}
		return false;
		*/
		
		for(NumberGroup i : groupList) {
			if(i.contains(value)) {
				return true;
			}
		}
		return false;
		
	}

}
