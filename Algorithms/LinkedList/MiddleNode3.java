/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleNode3 {
    public ListNode middleNode(ListNode head) {
        
        //Initialize the fast and slow pointers
        ListNode fast = head, slow = head;
        
        // Traverse the linkedlist and update fast and slow pointers
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
    
        // return the slow pointer.
        return slow;
    }
}
