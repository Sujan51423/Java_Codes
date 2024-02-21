/**
 * 
 */
package arrayCodes;

/**
 * @author Sujan5
 *
 */
public class Reverse_an_Array_without_Full_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};
		
		reverseArray(array);
		
	}

	private static void reverseArray(int[] array) {
		int n = array.length-1;
		for(int i=0; i<(array.length/2)+1; i++) {
			int temp = array[i];
			array[i] = array[n-i];
			array[n-i] = temp;
		}
		
		for(int num: array) {
			System.out.println(num);
		}
		
	}

}
