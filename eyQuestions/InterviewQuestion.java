/**
 * 
 */
package eyQuestions;

/**
 * @author Sujan5
 *
 */
public class InterviewQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] array = new int[2][2];
		array[0][0] = 11;
		array[0][1] = 12;
		array[1][0] = 21;
		array[1][1] = 22;
		
		rotateArray(array,90+90);
	}

	private static void rotateArray(int[][] array, int i) {
		
		int rotations = i/90;
		
		while(rotations>0) {
			int temp = array[0][0];
			array[0][0] = array[1][0];
			array[1][0] = array[1][1];
			array[1][1] = array[0][1];
			array[0][1] = temp;
			rotations--;
		}
		for(int j = 0; j<array.length; j++) {
			for(int k = 0; k<array.length; k++) {
				System.out.print(array[j][k] + " ");
			}
			System.out.println();
		}
		
	}

}
