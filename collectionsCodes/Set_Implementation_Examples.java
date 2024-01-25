/**
 * 
 */
package collectionsCodes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Sujan5
 *
 */
public class Set_Implementation_Examples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> lHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<>();

		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(56);
		hashSet.add(8);

		lHashSet.add(1);
		lHashSet.add(3);
		lHashSet.add(3);
		lHashSet.add(2);
		lHashSet.add(56);
		lHashSet.add(8);

		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(56);
		treeSet.add(8);

		System.out.println(hashSet);

		System.out.println(lHashSet);

		System.out.println(treeSet);
	}

}
