/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleNode2 {
    public ListNode middleNode(ListNode head) {
        
        //Initialize the arraylist to store nodes
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        
        // Traverse the linkedlist and add node to the list
        while(current != null){
            list.add(current);
            current = current.next;
        }
        
        // Find the middle index
        int middle = list.size()/2;
        
        // return the listnode at the middle index.
        return list.get(middle);
    }
}
