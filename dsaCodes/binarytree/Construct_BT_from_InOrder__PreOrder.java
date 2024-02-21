/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Construct_BT_from_InOrder__PreOrder {

	private static int preIndex;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] inOrder = {2,3,4,5,6,7,8};
		int[] preOrder = {5,3,2,4,7,6,8};
		Node root = buildTree(inOrder, preOrder, 0, inOrder.length-1);
		
		System.out.println("****InOrder Traversal****");
		inOrder(root);
		
		System.out.println("****PreOrder Traversal****");
		preOrder(root);

	}

	private static Node buildTree(int[] inOrder, int[] preOrder, int start, int end) {
		
		if(start>end) {
			return null;
		}
		
		Node node = new Node(preOrder[preIndex++]);
		
		if(start==end) {
			return node;
		}
		
		int index = 0;
		for(index = 0; index<inOrder.length; index++) {
			if(inOrder[index] == node.val) {
				break;
			}
		}
		
		node.left = buildTree(inOrder, preOrder, start, index-1);
		node.right = buildTree(inOrder, preOrder, index+1, end);
		
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

	private static void preOrder(Node node) {

		if (node == null) {
			return;
		}

		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}

}
