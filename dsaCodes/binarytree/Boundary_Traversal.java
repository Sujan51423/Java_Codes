/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Boundary_Traversal {

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
		
		boundaryTraversal(root);
	}

	private static void boundaryTraversal(Node root) {
		
		leftTraversal(root);
		printLeafNodes(root);
		rightTraversal(root.right);
		
	}

	private static void leftTraversal(Node node) {
		if(node==null) {
			return;
		}
		if(node.left==null && node.right==null) {
			return;
		}
		System.out.println(node.val);
		leftTraversal(node.left);
	}

	private static void printLeafNodes(Node node) {
		if(node == null) {
			return;
		}
		if(node.left==null && node.right==null) {
			System.out.println(node.val);
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
	}

	private static void rightTraversal(Node node) {
		if(node==null) {
			return;
		}
		if(node.left==null && node.right==null) {
			return;
		}
		leftTraversal(node.right);
		System.out.println(node.val);
	}
	
	

}
