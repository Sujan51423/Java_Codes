/**
 * 
 */
package dsaCodes.binarytree;


/**
 * @author Sujan5
 *
 */
public class Print_Leaf_Nodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right.left = new Node(2);
		
		root.right = new Node(7);
		root.right.left = new Node(9);
		root.right.right = new Node(8);
		
		System.out.println("***Leaf Nodes(Normal)***");
		printLeafNode(root);
		
		System.out.println("***Leaf Nodes(Reverse)***");
		printLeafNodeReverse(root);
		
	}

	private static void printLeafNodeReverse(Node node) {
		
		if(node == null) {
			return;
		}
		
		if(node.left == null && node.right == null) {
			System.out.println(node.val);
			return;
		}

		printLeafNodeReverse(node.right);
		printLeafNodeReverse(node.left);
		
	}

	private static void printLeafNode(Node node) {
		
		if(node == null) {
			return;
		}
		
		if(node.left == null && node.right == null) {
			System.out.println(node.val);
			return;
		}
		
		printLeafNode(node.left);
		printLeafNode(node.right);
		
	}

}
