import java.util.Stack;

class StockSpanner {
    Stack<Pair> st;
    int ind;

    public StockSpanner() {
        st = new Stack<>();
        ind = -1;
    }

    public int next(int price) {
        ind = ind + 1;
        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }
        int ans = ind - (st.isEmpty() ? -1 : st.peek().index);
        st.push(new Pair(price, ind));
        return ans;
    }
}

class Pair {
    int price;
    int index;

    Pair(int price, int index) {
        this.price = price;
        this.index = index;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
