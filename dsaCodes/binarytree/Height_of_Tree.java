/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Height_of_Tree {

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
		
		System.out.println(heightOfTree(root));
		
	}

	private static int heightOfTree(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		int leftHeight = heightOfTree(node.left);
		int rightHeight = heightOfTree(node.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
