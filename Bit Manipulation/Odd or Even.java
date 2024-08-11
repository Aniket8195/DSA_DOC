class Solution {
    static String oddEven(int n) {
        // code here
          // the last bit of every odd number is always one . ex : n=3 is 011 ,n=5 is 101 
        // so performing  and (&) operation will always results in 1 .

        if((n&1)==1){  //this means it is an odd number 
            return "odd" ;
        }
        else{
            return "even" ;
        }
        
    }
}
