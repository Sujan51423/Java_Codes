/**
 * 
 */
package dsaCodes.binarytree;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Spiral_Order_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right.left = new Node(2);
		
		root.right = new Node(7);
		root.right.left = new Node(9);
		root.right.right = new Node(8);
		
		spiralOrderTraversal(root);
		
	}

	private static void spiralOrderTraversal(Node node) {
		
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		stack1.push(node);
		
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				Node temp = stack1.pop();
				System.out.println(temp.val);
				if(temp.left!=null) {
					stack2.push(temp.left);
				}
				if(temp.right!=null) {
					stack2.push(temp.right);
				}
			}
			while(!stack2.isEmpty()) {
				Node temp = stack2.pop();
				System.out.println(temp.val);
				if(temp.right!=null) {
					stack1.push(temp.right);
				}
				if(temp.left!=null) {
					stack1.push(temp.left);
				}
			}
		}
	}

}
