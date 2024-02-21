/**
 * 
 */
package dsaCodes.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sujan5
 *
 */
public class Root_to_Leaf_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(10);

		root.left = new Node(8);
		root.left.left = new Node(3);
//		root.left.right = new Node(4);

		root.right = new Node(5);
		root.right.left = new Node(11);
		root.right.right = new Node(9);
		
		int sum = 24;
		List<Integer> list = new ArrayList<>();
		rootToLeafSum(root, list, sum);
		
		
	}

	private static boolean rootToLeafSum(Node node, List<Integer> list, int sum) {
		
		if(node == null) {
			return false;
		}
		
		if((node.left==null && node.right==null) && node.val == sum) {
			list.add(node.val);
			System.out.println(node.val);
			return true;
		}
		
		if(rootToLeafSum(node.left, list, sum-node.val)) {
			list.add(node.val);
			System.out.println(node.val);
			return true;
		}
		
		if(rootToLeafSum(node.right, list, sum-node.val)) {
			list.add(node.val);
			System.out.println(node.val);
			return true;
		}
		
		return false;
	}

}
