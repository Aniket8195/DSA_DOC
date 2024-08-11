
class Solution {
    static void bitManipulation(int num, int i) {
        // code here
         System.out.print((
        (num>>(i-1))&1)+" "
        +(num|(1<<i-1))+" "
        +(num&(~(1<<(i-1))))
    );
    }
}
