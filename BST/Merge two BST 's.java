class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
     ArrayList<Integer> al=new ArrayList<>();
    public List<Integer> merge(Node root1,Node root2)
    {
           inorder(root1);
        inorder(root2);
        Collections.sort(al);
        return al;
    }
     public  void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
}
