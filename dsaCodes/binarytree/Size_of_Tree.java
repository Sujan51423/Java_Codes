/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Size_of_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(4);

		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);

		root.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(7);
		
		int size = sizeOfTree(root);
		System.out.println(size);
	}

	private static int sizeOfTree(Node node) {
		
		if(node ==null) {
			return 0;
		}
		
		int lSize = sizeOfTree(node.left);
		int rSize = sizeOfTree(node.right);
		return lSize + rSize + 1;
	}

}
