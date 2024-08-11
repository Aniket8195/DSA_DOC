class Solution {
    static int setBit(int n) {
        // code here
         return n | (n + 1); // can do as find the position of set bit and then take (n|i<<j) where j is the position of set bit from right (striver solution)
    }
}
