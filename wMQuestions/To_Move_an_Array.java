/**
 * 
 */
package wMQuestions;

/**
 * @author Sujan5
 *
 */
public class To_Move_an_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {2, 1, 2, 2, 2, 3, 4, 2};
		int toMove = 2;
		
		moveArray(array, toMove);
	}

	private static void moveArray(int[] array, int toMove) {
		
		int i = 0, j = 1;
		
		while(j<array.length) {
			if(array[j]!=toMove) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		
		for(int n: array) {
			System.out.println(n);
		}
		
	}

}
