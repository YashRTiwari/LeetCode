package LC30DayChallenge.day8;


//  Definition for singly-linked list.


class MiddleoftheLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
        int count =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            ++count;
        }

        int middleCount = count/2;
        temp = head;
        count = 0;
        while(temp != null){
            if(count == middleCount)
                return temp;
            temp = temp.next;
            ++count;
        }

        return head;
    }
}
