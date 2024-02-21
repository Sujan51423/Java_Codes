/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Create_Mirror_of_Binary_Tree {

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
		
		System.out.println("***Normal Tree***");
		inOrder(root);
		
		System.out.println("***Mirror Tree***");
		Node mirrorRoot = mirrorTree(root);
		inOrder(mirrorRoot);
	}
	
	private static Node mirrorTree(Node node) {
		
		if(node==null) {
			return null;
		}
		
		Node temp = node.right;
		node.right = node.left;
		node.left = temp;
		
		mirrorTree(node.left);
		mirrorTree(node.right);
		
		return node;
	}

	private static void inOrder(Node node) {

		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.println(node.val);
		inOrder(node.right);
	}

}
