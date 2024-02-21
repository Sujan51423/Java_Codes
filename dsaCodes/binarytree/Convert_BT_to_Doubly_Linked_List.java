/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Convert_BT_to_Doubly_Linked_List {

	static Node head = null ,prev= null;
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
		
		convertBTtoDLL(root);
		
		printDLL(head);
	}
	private static void printDLL(Node node) {
		while(head.right!=null) {
			System.out.println(head.val);
			head = head.right;
		}
	}
	private static void convertBTtoDLL(Node node) {
		
		if(node== null) {
			return;
		}
		
		convertBTtoDLL(node.left);
		
		if(prev==null) {
			head = node;
		}
		else {
			node.left = prev;
			prev.right = node;
		}
		prev = node;
		
		convertBTtoDLL(node.right);
	}

}
