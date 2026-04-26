package medium;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current =dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry !=0){
            int sum = carry;
            if(l1 != null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return dummy.next;
    }
//    utility  method to print linked list
    public static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
//    main method
    public static void main(String[] args) {
//        creating First Node: 342 stored as (2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

//        creating second number: 465 stored as (5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers obj = new AddTwoNumbers();
//        calling method
        ListNode result = obj.addTwoNumbers(l1,l2);
//        printing result
        printList(result);
}
}

