/**
 * 
 */
package dsaCodes.binarytree;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sujan5
 *
 */
public class Bottom_View_of_Tree {
	
	
	static Map<Integer,Integer> valueMap = new TreeMap<>();

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
		
		valueMap.put(0, root.val);
		bottomViewOfTree(root,0);
		
		valueMap.entrySet().stream().forEach(s->System.out.println(s.getValue()));
		
	}

	private static void bottomViewOfTree(Node node, int level) {
		
		if(node==null) {
			return;
		}
		
		bottomViewOfTree(node.left,level-1);
		valueMap.put(level, node.val);
		bottomViewOfTree(node.right,level+1);
	}

}
