/**
 * 
 */
package stringCodes;

import java.util.Arrays;

/**
 * @author Sujan5
 *
 */
public class Longest_Common_Prefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		String[] strs = {"flower","flow","flight"};
		String[] strs1 = {"ab", "a"};
		String prefix = longestCommonPrefixOptimal(strs1);
		System.out.println(prefix);
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length ==1) {
			return strs[0];
		}
		
		Arrays.sort(strs);
		
		String sString = new String();
		int i = 0, count=0, check =0;
		for (i = 1; i <= strs[0].length(); i++) {
			sString = strs[0].substring(0, i);
			count=0;
			for (String s: strs) {
				if (s.substring(0, i).equals(sString)) {
					count++;
				}
			}
			if(count!=strs.length) {
				return strs[0].substring(0, i-1);
			}
			check++;
		}
		if(check==0) {
			return "";
		}
		return strs[0].substring(0, i-1);
    }
	
	public static String longestCommonPrefixOptimal(String[] strs) {
		if(strs == null || strs.length == 0) return "";
        String pre = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(pre)){
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
	}
}
