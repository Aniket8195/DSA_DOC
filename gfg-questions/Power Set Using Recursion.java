class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String>res=new ArrayList<>();
        StringBuilder cur=new StringBuilder();
        rec(s,res,cur,0);
        return res;
    }
    static void rec(String s,ArrayList<String>res,StringBuilder cur,int i){
        if(i==s.length()){
            res.add(cur.toString());
            return;
        }
        rec(s,res,cur.append(s.charAt(i)),i+1);
        if (cur.length() > 0) {
         cur.setLength(cur.length() - 1);
        }
        rec(s,res,cur,i+1);
    }
}
