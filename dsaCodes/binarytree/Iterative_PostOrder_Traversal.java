/**
 * 
 */
package dsaCodes.binarytree;

import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Iterative_PostOrder_Traversal {

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
		
		iterativePostOrderTraversal(root);
		
	}

	private static void iterativePostOrderTraversal(Node node) {
		
		if(node==null) {
			return;
		}
		
		Stack<Node> stk = new Stack<>();
		
//		stk.push(node);
		Node root = node;
		while(!stk.isEmpty()||node!=null) {
			if(node!=null) {
				stk.push(node);
				node=node.left;
			}
			else {
				Node temp = stk.peek().right;
				if (temp==null) {
					temp = stk.pop();
					System.out.println(temp.val);
					while(!stk.isEmpty() && temp == stk.peek().right) {
						System.out.println(stk.pop().val);
					} 
				}
				else {
					node = temp;
				}
			}
		}
		
	}

}
