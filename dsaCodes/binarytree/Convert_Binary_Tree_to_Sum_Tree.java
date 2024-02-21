/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Convert_Binary_Tree_to_Sum_Tree {
	
	static Node root = new Node(5);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		System.out.println("**Normal Tree**");
		inOrder(root);
		
		System.out.println("**Sum Tree**");
		convertSumTree(root);
		inOrder(root);
		
	}

	private static void inOrder(Node node) {
		
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.println(node.val);
		inOrder(node.right);
		
	}

	private static int convertSumTree(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		int currVal = node.val;
		
		int lVal = convertSumTree(node.left);
		int rVal = convertSumTree(node.right);
		
		node.val = lVal + rVal;
		
		return currVal+node.val;
	}

}
