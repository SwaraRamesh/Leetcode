package Easy;	

class MergeTwoSortedLists extends ListNode{
	
	public static void main (String [] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode();
		ListNode list12 = list1.next;
		list12.val = 2;
		list12.next = new ListNode();
		ListNode list13 = list12.next;
		list13.val = 4;
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode();
		ListNode list22 = list2.next;
		list22.val = 2;
		list22.next = new ListNode();
		ListNode list23 = list22.next;
		list23.val = 4;
		
		
		ListNode list = mergeTwoLists(list1, list2);
		System.out.println("This is the merged list: ");
		while (list != null) {
			System.out.println(list.val);
			list = list.next;
		}
		
	}
	
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode temp = new ListNode();
        temp = head;
        while (list1 != null && list2 != null) {
            if (head == null) {
            	System.out.println("null");
                head = temp;
            }
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 == null && list2 != null) {
            temp.next = list2;
        }
        else if (list1 != null && list2 == null) {
            temp.next = list1;
        }
        return head.next;
    }
	}
