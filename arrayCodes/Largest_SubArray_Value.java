/**
 * 
 */
package arrayCodes;

/**
 * @author Sujan5
 *
 */
public class Largest_SubArray_Value {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int maxArray[] = new int[a.length];
		int max = a[0];
		maxArray[0] = a[0];
		for(int i = 1; i<a.length;i++) {
			maxArray[i] = Math.max(a[i], maxArray[i-1]+a[i]);
			if(maxArray[i]>max) {
				max = maxArray[i];
			}
		}
		System.out.println("Maximum SubArrau Value is :" + max);
	}

}
