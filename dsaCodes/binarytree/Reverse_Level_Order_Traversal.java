/**
 * 
 */
package dsaCodes.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Sujan5
 *
 */
public class Reverse_Level_Order_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		root.left.left = new Node(90);
		root.left.right = new Node(50);
		
		root.right = new Node(60);
		root.right.left = new Node(70);
		root.right.right = new Node(80);
		
		reverseLevelOrderTravel(root);
	}

	private static void reverseLevelOrderTravel(Node node) {
		
		Queue<Node> que = new ArrayDeque<>();
		Stack<Node> stk = new Stack<>();
		
		que.add(node);
		
		while(!que.isEmpty()) {
			Node temp = que.poll();
			stk.push(temp);
			if(temp.right!=null) {
				que.add(temp.right);
			}
			if(temp.right!=null) {
				que.add(temp.left);
			}	
		}
		
		while(!stk.isEmpty()) {
			System.out.println(stk.pop().val);
		}	
	}

}
