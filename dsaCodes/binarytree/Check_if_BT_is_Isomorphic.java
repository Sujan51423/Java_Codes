/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Check_if_BT_is_Isomorphic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		Node root1 = new Node(5);

		root1.right = new Node(3);
		root1.right.right = new Node(2);

		root1.left = new Node(7);
		root1.left.right = new Node(6);
		root1.left.left = new Node(8);
		
		System.out.println(isomorphicCheck(root, root1));
		
	}

	private static boolean isomorphicCheck(Node node1, Node node2) {
		
		if(node1==null && node2==null) {
			return true;
		}
		if(node1==null || node2==null) {
			return false;
		}
		if(node1.val != node2.val) {
			return false;
		}
		
		boolean a1 = isomorphicCheck(node1.left, node2.left);
		boolean a2 = isomorphicCheck(node1.right, node2.right);
		boolean a = a1 && a2;
		
		boolean b1 = isomorphicCheck(node1.left, node2.right);
		boolean b2 = isomorphicCheck(node1.right, node2.left);
		boolean b = b1 && b2;
				
		return a||b;
	}
	
	

}
