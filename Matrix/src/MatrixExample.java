
public class MatrixExample {
	private int[][] matrix;
	
	public MatrixExample(int numRows, int numCols) {
		matrix = new int[numRows][numCols];
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix.length; c++) {
				matrix[r][c] = r * c + 2 * r - c;
			}
		}
	}
	
	public String toString() {
		String output = "";
		for(int[] row : matrix) {
			for(int element : row) {
				output += element + " ";
			}
			output += "\n";
		}
		output += "\n";
		return output;
	}
	

	
	public int totalAll() {
		int total = 0;
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix.length; c++) {
				total += matrix[r][c];
				
			}
		}
		return total;
	}
	
	public int[] totalRow() {
		int[] array = new int[matrix.length];
		int total = 0;
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix[0].length; c++) {
				total += matrix[r][c];
				
			}
			array[r] = total;
			total = 0;
		}

		return array;
	}
	
	public int[] totalCol() {
		int[] array = new int[matrix[0].length];
		int total = 0;
		for(int r = 0; r < matrix[0].length; r++) {
			for(int c = 0; c < matrix.length; c++) {
				total += matrix[c][r];
				
			}
			array[r] = total;
			total = 0;
		}

		return array;
	}
	

}

