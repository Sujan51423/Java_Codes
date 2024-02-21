/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Least_Common_Ancestor {

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
		
		int val1 = 2, val2 = 7;
		
		Node lca = leastCommonAncestor(root, val1, val2);
		System.out.println(lca.val);
	}

	private static Node leastCommonAncestor(Node node, int val1, int val2) {
		if(node==null) {
			return null;
		}
		if(node.val == val1 || node.val == val2) {
			return node;
		}
		
		Node lNode = leastCommonAncestor(node.left, val1, val2);
		Node rNode = leastCommonAncestor(node.right, val1, val2);	
		
		if(lNode!=null && rNode!=null) {
			return node;
		}
		return lNode!=null ? lNode: rNode;
	}

}
