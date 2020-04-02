package convertbinarynumber_in_al_inkedlist_to_integer;

class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public int getDecimalValue(ListNode head) {

        int [] nums = new int[30];
        int index = 0;
        while(head != null){
            nums[index] = head.val;
            head = head.next;
            index++;
        }

        int value = 0;
        int power = index - 1;
        for(int x=0; x<index; x++){
            value += nums[x]*Math.pow(2, power--);
        }

        return value;
    }
}