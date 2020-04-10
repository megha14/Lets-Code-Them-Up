/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleNode1 {
    public ListNode middleNode(ListNode head) {
        
        // Initialize size of linkedlist, middle variable and current node
        int size = 0, middle = 0;
        ListNode current = head;
        
        // Traverse through linked list to find the size;
        while(current != null){
            current = current.next;
            size++;
        }
        
        // Calculate middle 
        middle = size/2;
        
        // Traverse linkedlist until i becomes middle
        int i = 0;
        current = head;
        while(i != middle){
            current = current.next;
            i++;
        }
        
        // return the middle node
        return current;
    }
}
