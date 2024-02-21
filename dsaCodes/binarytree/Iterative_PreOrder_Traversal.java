/**
 * 
 */
package dsaCodes.binarytree;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Iterative_PreOrder_Traversal {

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
		
		iterativePreOrderTraversal(root);
		
	}

	private static void iterativePreOrderTraversal(Node node) {
		
		Stack<Node> stk = new Stack<>();
		
		stk.push(node);
		
		while(!stk.isEmpty()) {
			Node temp = stk.pop();
			System.out.println(temp.val);
			if(temp.right!=null) {
				stk.push(temp.right);
			}
			if(temp.left!=null) {
				stk.push(temp.left);
			}
		}	
	}

}
