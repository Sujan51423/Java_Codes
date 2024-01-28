/**
 * 
 */
package dsaCodes;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Valid_Paranthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "((";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {

		Stack<Character> cStack = new Stack<>();

		char[] cArray = s.toCharArray();
		if(cArray.length == 1) {
			return false;
		}

		for (Character c : cArray) {
			if (c.toString().equals("(") || c.toString().equals("{") || c.toString().equals("[")) {
				cStack.push(c);
			}
			else if (c.toString().equals("(") || c.toString().equals("{") || c.toString().equals("[")) {
				if (!cStack.isEmpty()) {
					String pop = cStack.pop().toString();
					boolean flag = false;
					switch (c.toString()) {
					case ")":
						if (pop.equals("(")) {
							flag = true;
						}
						break;
					case "}":
						if (pop.equals("{")) {
							flag = true;
						}
						break;
					case "]":
						if (pop.equals("[")) {
							flag = true;
						}
						break;
					default:
						return false;
					}
					if (flag) {
						continue;
					} else {
						return false;
					} 
				}
				else return false;
			}
		}
		if(!cStack.isEmpty()) {
			return false;
		}

		return true;
	}

}
