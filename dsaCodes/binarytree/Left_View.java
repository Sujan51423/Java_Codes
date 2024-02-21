/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Left_View {

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
		
		leftView(root,1);
	}

	private static void leftView(Node node, int cLevel) {
		
		if(node==null) {
			return;
		}
		
		if(cLevel > maxLevel) {
			System.out.println(node.val);
			maxLevel = cLevel;
		}
		
		leftView(node.left,cLevel+1);
		leftView(node.right, cLevel+1);
	}

}
