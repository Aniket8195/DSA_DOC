class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        fun(s);
         return s;
    }
    static void fun(Stack<Integer> s){
        if(s.size()>0){
            int x =s.peek();
            s.pop();
            fun(s);
            insert_at_top(s,x);
        }
    }
    static void insert_at_top(Stack<Integer> s,int x){
        if(s.size()==0)s.push(x);
 
        else if(s.peek()>x){
            int y =s.peek();
            s.pop();
            insert_at_top(s,x);
            s.push(y);
        }
        else{
            s.push(x);
        }
    }
   
}
