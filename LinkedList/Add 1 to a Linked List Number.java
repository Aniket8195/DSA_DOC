class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        int carry=solve(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            return newNode;
        }
        return head;
    }
    private static int solve(Node temp){
        if(temp==null)return 1;
        int carry = solve(temp.next);
        int sum = temp.data + carry;
        temp.data = sum % 10;
        return sum / 10;

    }
}
