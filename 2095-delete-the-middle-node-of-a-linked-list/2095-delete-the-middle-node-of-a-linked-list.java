

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode curr = head;
        int count = 0;
        while(curr!= null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int middle = (count)/2;
        int i = 0;
        while(i != middle-1){
            i++;
            curr = curr.next;
        }
       
        curr.next = curr.next.next;
        return head;
    }
}