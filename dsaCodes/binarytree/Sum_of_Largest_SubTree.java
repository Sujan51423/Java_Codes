/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Sum_of_Largest_SubTree {

	static int sum = Integer.MIN_VALUE;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(-5);

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
//		root.left.right.right = new Node(14);
//		root.left.right.right.left = new Node(24);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(-8);
		
		largestSubTreeSum(root);
		System.out.println(sum);
		
	}

	private static int largestSubTreeSum(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		int lSum = largestSubTreeSum(node.left);
		int rSum = largestSubTreeSum(node.right);
		
		if(lSum+rSum+node.val > sum) {
			sum = lSum+rSum+node.val;
		}
		
		return lSum+rSum+node.val;
	}

}
