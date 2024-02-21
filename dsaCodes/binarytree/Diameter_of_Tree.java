/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Diameter_of_Tree {

	static int diameter = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);
//		root.left.left.left = new Node(0);
		root.left.right = new Node(4);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		System.out.println(diameterOfTree(root));
		diameterOfTreeJava(root);
		System.out.println(diameter);
	}
	
	private static int diameterOfTree(Node node) {
		
		int max = 0;
		
		max = heightOfTree(node,max);
		
		return max;
	}
	
	private static int heightOfTree(Node node, int max) {
		
		if (node == null) {
			return 0;
		}
		
		int leftHeight = heightOfTree(node.left,max);
		int rightHeight = heightOfTree(node.right,max);
		int curr = leftHeight + rightHeight;
		max = Math.max(max, curr);
		return Math.max((Math.max(leftHeight, rightHeight)+1),max);
	}
	
	private static int diameterOfTreeJava(Node node) {
		if(node==null) {
			return 0;
		}
		
		if(node.left==null && node.right==null) {
			return 1;
		}
		
		int lDia = diameterOfTreeJava(node.left);
		int rDia = diameterOfTreeJava(node.right);
		
		diameter = Math.max(diameter,lDia + rDia +1);
		
		return Math.max(lDia,rDia) +1;
	}
	
}
