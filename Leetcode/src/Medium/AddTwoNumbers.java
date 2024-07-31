package Medium;

public class AddTwoNumbers extends ListNode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode();
		ListNode list12 = list1.next;
		list12.val = 4;
		list12.next = new ListNode();
		ListNode list13 = list12.next;
		list13.val = 3;
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode();
		ListNode list22 = list2.next;
		list22.val = 6;
		list22.next = new ListNode();
		ListNode list23 = list22.next;
		list23.val = 4;
		
		
		ListNode list = addTwoNumbers(list1, list2);
		System.out.println("This is the added list: ");
		while (list != null) {
			System.out.println(list.val);
			list = list.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;

        ListNode list = new ListNode();
        if (l1.val + l2.val > 9) {
            list.val = l1.val + l2.val - 10;
            carry = 1;
        }
        else {
            list.val = l1.val + l2.val;
        }
        ListNode curr=list;
        while (l1 != null || l2 != null || carry != 0) {
            
            l1 = (l1 != null? l1.next: null);
            l2 = (l2 != null? l2.next: null);
            if (l1 == null && l2 == null && carry ==0)
                break;
            sum = (l1 != null? l1.val :0)  + (l2 != null? l2.val :0) + carry;
            if (sum > 9) {
                curr.next = new ListNode(sum %10);
                carry=1;
            }
            else {
                curr.next = new ListNode(sum); 
                carry=0;
            }
            curr = curr.next;
        }
        return list;
    }

}
