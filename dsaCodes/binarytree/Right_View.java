/**
 * 
 */
package dsaCodes.binarytree;
//import dsaCodes.binarytree.Node;

/**
 * @author Sujan5
 *
 */
public class Right_View {

	static int maxLevel = 0;
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
		
		rightView(root,1);
	}

	private static void rightView(Node node, int level) {
		
		if(node==null) {
			return;
		}
		
		if(level>maxLevel) {
			maxLevel = level;
			System.out.println(node.val);
		}
		
		rightView(node.right, level+1);
		rightView(node.left,level+1);
		
	}

}

