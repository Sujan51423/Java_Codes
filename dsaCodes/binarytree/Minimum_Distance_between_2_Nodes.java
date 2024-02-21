/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Minimum_Distance_between_2_Nodes {

	static int minD = Integer.MAX_VALUE;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node(5);

		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
//		root.left.right.left = new Node(14);
//		root.left.right.left.left = new Node(24);
//		root.left.right.left.left.left = new Node(34);

		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		int val1 = 2, val2 = 7; 
		minimumDistance(root,val1,val2);
		System.out.println(minD);
		
	}

	private static int minimumDistance(Node node, int val1, int val2) {
		
		if(node==null) {
			return 0;
		}
		
		int lDist = minimumDistance(node.left,val1,val2);
		int rDist = minimumDistance(node.right,val1,val2);
		
		if(lDist!=0 && rDist!=0) {
			minD = lDist + rDist;
			return 0;
		}
		else if(node.val==val1 || node.val==val2) {
			if(lDist!=0 || rDist!=0) {
				minD = Math.max(lDist, rDist);
				return 0;
			}
			else {
				return 1;
			}
		}
		else if(lDist!=0 || rDist!=0) {
			return Math.max(lDist, rDist)+1;
		}
		
		return 0;
	}

}
