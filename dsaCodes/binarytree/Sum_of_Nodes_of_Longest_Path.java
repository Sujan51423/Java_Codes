/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Sum_of_Nodes_of_Longest_Path {

	static int sum = 0,level = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.left.right.right = new Node(14);
		root.left.right.right.left = new Node(24);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		sumOfLongestPathNodes(root,0,0);
		System.out.println(sum);
		
	}
	
	private static void sumOfLongestPathNodes(Node node, int val, int lvl) {
		
		if(node==null) {
			return;
		}
		if(node.left==null && node.right==null) {
			if(val+node.val > sum) {
				sum = val+node.val;
				return;
			}
		}
		
		sumOfLongestPathNodes(node.left,node.val+val,lvl+1);
		sumOfLongestPathNodes(node.right,node.val+val,lvl+1);
	}

}
