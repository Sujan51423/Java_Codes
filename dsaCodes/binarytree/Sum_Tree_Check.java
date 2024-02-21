/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Sum_Tree_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(26);
		root.left = new Node(10);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		
		root.right = new Node(3);
		root.right.right = new Node(3);
		
		if(sumTreeCheck(root)==root.val*2) {
			System.out.println("It is Sum Tree");
		}
		else {
			System.out.println("Not a Sum Tree");
		}
	}

	private static int sumTreeCheck(Node node) {
		
		if(node==null) {
			return 0;
		}
		if(node.left==null && node.right==null) {
			return node.val;
		}
		int lVal = sumTreeCheck(node.left);
		int rVal = sumTreeCheck(node.right);
		
		return node.val + lVal + rVal;
	}

}
