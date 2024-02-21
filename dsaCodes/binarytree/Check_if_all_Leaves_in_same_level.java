/**
 * 
 */
package dsaCodes.binarytree;

/**
 * @author Sujan5
 *
 */
public class Check_if_all_Leaves_in_same_level {

	static int depth = 0;
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
		root.right.left.left = new Node(8);
		
		System.out.println(leafNodeSameLevelCheck(root,0));
		
	}

	private static boolean leafNodeSameLevelCheck(Node node, int lvl) {
		
		if(lvl>depth) {
			depth = lvl;
		}
		if(node==null) {
			return false;
		}
		
		if(node.left==null && node.right==null) {
			if(lvl == depth) {
				return true;
			}
			return false;
		}
		
		boolean lCheck = leafNodeSameLevelCheck(node.left,lvl+1);
		boolean rCheck = leafNodeSameLevelCheck(node.right,lvl+1);
		return lCheck && rCheck;
	}

}
