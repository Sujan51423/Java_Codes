/**
 * 
 */
package dsaCodes.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Sujan5
 *
 */
public class Breadth_First_Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(4);

		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);

		root.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		System.out.println("****BFS (While)****");
		breadthFirstSearch(root);
	}

	private static void breadthFirstSearch(Node node) {

		Queue<Node> bQ = new ArrayDeque<>();

		bQ.add(node);

		while (!bQ.isEmpty()) {

			Node temp = bQ.poll();

			System.out.println(temp.val);

			if (temp.left != null && temp.right != null) {
				bQ.add(temp.left);
				bQ.add(temp.right);
			} else if (temp.left != null) {
				bQ.add(temp.left);
			} else if (temp.right != null) {
				bQ.add(temp.right);
			}

		}

	}

}

/*
 * class Node {
 * 
 * int val; Node left; Node right;
 * 
 * Node(int val) { this.val = val; } }
 */