/**
 * 
 */
package interviewCoding;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class BODMAS_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String exp = "(14+19)/(13-2)";
		
		System.out.println(bodmasSoln(exp));
		
	}

	private static int bodmasSoln(String exp) {
		
		char[] exps = exp.toCharArray();
		
		Stack<Integer> intStack = new Stack<>();
		Stack<Character> charStack = new Stack<>();
		
		for(int i = 0; i < exps.length; i++) {
			if(exps[i] == ' ') {
				continue;
			}
			if(Character.isDigit(exps[i])) {
				StringBuilder str = new StringBuilder();
				while(i<exps.length && Character.isDigit(exps[i])) {
					str.append(exps[i]);
					i++;
				}
				i--;
				intStack.push(Integer.parseInt(str.toString()));
			}
			else if(exps[i]=='(') {
				charStack.push(exps[i]);
			}
			else if(exps[i]==')') {
				while(charStack.peek()!='(') {
					intStack.push(operateValue(charStack.pop(),intStack.pop(),intStack.pop()));
				}
				charStack.pop();
			}
			else if(exps[i]=='+' || exps[i]=='-' || exps[i]=='*' || exps[i]=='/') {
				while(!charStack.isEmpty() && checkPrece(exps[i],charStack.peek())) {
					intStack.push(operateValue(charStack.pop(),intStack.pop(),intStack.pop()));
				}
				charStack.push(exps[i]);
			}
		}
		while(!charStack.isEmpty()) {
			intStack.push(operateValue(charStack.pop(),intStack.pop(),intStack.pop()));
		}
		return intStack.pop();
	}

	private static boolean checkPrece(char op1, Character op2) {
		
		if(op2 == '(' || op2 == ')') {
			return false;
		}
		if((op1 == '/' || op1 =='*') && (op2 == '+' || op2 =='-')) {
			return false;
		}
		return true;
	}

	private static int operateValue(Character operand, Integer var2, Integer var1) {
		switch(operand) {
			case '+':
				return var1+var2;
			
			case '-':
				return var1-var2;
				
			case '*':
				return var1*var2;
				
			case '/':
				return var1/var2;
		}
		return 0;
	}

}
