/**
 * 
 */
package stringCodes;

/**
 * @author Sujan5
 *
 */
public class Index_of_First_Occurence_of_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "leetcode";
		String n = "co";
		int index = strStr(s, n);
		System.out.println(index);
	}
	
	public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

}
