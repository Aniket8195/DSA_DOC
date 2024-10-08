class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        Queue<Integer> q = new LinkedList<Integer>();
        int count =0;
        for(int i=0;i<N;i++)
        {
            if(!q.contains(pages[i]))
            {
                count++;
                q.add(pages[i]);
                if(q.size()>C)
                    q.remove();
            }
            else
            {
                q.remove(pages[i]);
                q.add(pages[i]);
            }
        }
        return count;
    }
}
