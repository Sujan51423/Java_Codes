/**
 * 
 */
package wMQuestions;

/**
 * @author Sujan5
 *
 */
public class Monotronic_Array_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrayT = {1, 2, 4, 7, 8, 11};
		System.out.println(monotronic_check(arrayT));
		
		int[] arrayF = {1, 2, 7, 4, 8, 11};
		System.out.println(monotronic_check(arrayF));
		
		int[] arrayDT = {11, 8, 7, 5, 1};
		System.out.println(monotronic_check(arrayDT));
		
		int[] arrayDF = {11, 8, 4, 5, 1};
		System.out.println(monotronic_check(arrayDF));
	}

	static boolean monotronic_check(int[] array) {		
		if(array[0]<array[1]) {
			for(int i = 1; i<array.length-1; i++) {
				if(array[i]>array[i+1]) {
					return false;
				}
			}
		}
		else {
			for(int i = 1; i<array.length-1; i++) {
				if(array[i]<array[i+1]) {
					return false;
				}
			}
		}		
		return true;
	}
}
