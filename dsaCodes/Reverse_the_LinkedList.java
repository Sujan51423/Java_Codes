/**
 * 
 */
package dsaCodes;

/**
 * @author Sujan5
 *
 */
public class Reverse_the_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		
		System.out.println("**Normal List**");
		printLinkedList(root);
		
		Node reverseRoot = reverseLinkedList(root);
		System.out.println("**Reversed List**");
		printLinkedList(reverseRoot);
	}

	public static Node reverseLinkedList(Node node) {
		if(node==null || node.next==null) {
			return node;
		}
		
		Node temp = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		
		return temp;
	}
	
	private static void printLinkedList(Node node) {
		
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}
		
	}
	
}
class Node {
	
	int val;
	Node next;
	
	Node(int val) {
		this.val = val;
	}
	
}
