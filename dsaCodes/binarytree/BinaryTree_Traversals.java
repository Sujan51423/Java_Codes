/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class BinaryTree_Traversals {

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

		System.out.println("****InOrder Traversal****");
		inOrder(root);
		
		System.out.println("****PreOrder Traversal****");
		preOrder(root);
		
		System.out.println("****PostOrder Traversal****");
		postOrder(root);
	}

	private static void inOrder(Node node) {

		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.println(node.val);
		inOrder(node.right);
	}

	private static void preOrder(Node node) {

		if (node == null) {
			return;
		}

		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}

	private static void postOrder(Node node) {

		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.val);
	}

}

class Node {

	int val;
	Node left;
	Node right;

	Node(int val) {
		this.val = val;
	}
}