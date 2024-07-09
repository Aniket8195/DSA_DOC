class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
      
    }
     static int countLoopLength(Node slow) {
        Node temp = slow;
        int count = 1;
        while (temp.next != slow) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
