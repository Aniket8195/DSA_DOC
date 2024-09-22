public class Solution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> lexicographicalNumbers = new ArrayList<>();
        // Start generating numbers from 1 to 9
        for (int start = 1; start <= 9; ++start) {
            generateLexicalNumbers(start, n, lexicographicalNumbers);
        }
        return lexicographicalNumbers;
    }

    private void generateLexicalNumbers(
        int currentNumber,
        int limit,
        List<Integer> result
    ) {
        // If the current number exceeds the limit, stop recursion
        if (currentNumber > limit) return;

        // Add the current number to the result
        result.add(currentNumber);

        // Try to append digits from 0 to 9 to the current number
        for (int nextDigit = 0; nextDigit <= 9; ++nextDigit) {
            int nextNumber = currentNumber * 10 + nextDigit;
            // If the next number is within the limit, continue recursion
            if (nextNumber <= limit) {
                generateLexicalNumbers(nextNumber, limit, result);
            } else {
                break; // No need to continue if nextNumber exceeds limit
            }
        }
    }
}










class Solution {
    public List<Integer> lexicalOrder(int n) {
    List<Integer> al = new  ArrayList<>();
    int curr = 1; 
    for(int i=1; i<=n; i++)
    {
      al.add(curr);
      if(curr*10<=n)
      curr = curr*10;
      else
      {
        while(curr%10==9 || curr>=n)
        {
          curr = curr/10;   
        } 
        curr += 1;
      }
    } 
    return al;

    }
}
