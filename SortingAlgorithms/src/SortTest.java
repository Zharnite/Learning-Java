
public class SortTest {

	public static void main(String[] args) {
		int[] values = {1,-1,42,90,-5,4,1,-96};
		SortingAlgorithms.selectionSort(values);
		SortingAlgorithms.printArr(values);
		
		String[] names = {"Elastic Rebound Theory","quasars","Love Waves","Rayleigh Waves","Curie Point","Earthquake","Dynamic Planet", "RIP","Zhen"};
		SortingAlgorithms.selectionSort(names);
		SortingAlgorithms.printArr(names);
		
	}
	
	
	
}
