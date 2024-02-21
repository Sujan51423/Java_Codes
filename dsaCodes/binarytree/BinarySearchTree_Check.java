/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class BinarySearchTree_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);

		root.right = new Node(7);
		root.right.left = new Node(9);
		root.right.right = new Node(8);
		
		System.out.println(binarySearchTreeCheck(root,Integer.MAX_VALUE, Integer.MIN_VALUE));
	}

	private static boolean binarySearchTreeCheck(Node node, int maxValue, int minValue) {
		
		if(node==null) {
			return true;
		}
		
		if(node.val>maxValue || node.val<minValue) {
			return false;
		}
		
		return binarySearchTreeCheck(node.left, node.val, minValue) && binarySearchTreeCheck(node.right, maxValue, node.val);
			
	}

}
