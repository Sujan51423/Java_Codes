/**
 * 
 */
package dsaCodes;

/**
 * @author Sujan5
 *
 */
public class Merge_Sorted_Linked_Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListNode list111 = new ListNode(4);
		ListNode list11 = new ListNode(2,list111);
		ListNode list1 = new ListNode(1,list11);
		
		ListNode list222 = new ListNode(4);
		ListNode list22 = new ListNode(3,list222);
		ListNode list2 = new ListNode(1,list22);
		
		ListNode sList = mergeTwoLists(list1, list2);
		
		ListNode.printNodes(sList);

	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1!=null && list2!=null) {
            if(list1.val<list2.val) {
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }
            else {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	static void printNodes(ListNode node) {
		while(node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
}
