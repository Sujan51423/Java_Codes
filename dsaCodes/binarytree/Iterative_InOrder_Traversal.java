/**
 * 
 */
package dsaCodes.binarytree;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Iterative_InOrder_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		iterativeInOrderTraversal(root);
		
	}

	private static void iterativeInOrderTraversal(Node node) {
		
		Stack<Node> stk = new Stack<>();
		
		while(true) {
			if(node != null) {
				stk.push(node);
				node = node.left;
			}
			else {
				if(stk.isEmpty()) {
					break;
				}
				Node temp = stk.pop();
				System.out.println(temp.val);
				node = temp.right;
				
			}
		}	
	}

}
