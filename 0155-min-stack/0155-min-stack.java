import java.util.Stack;

class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            st.push((long) value);
            min = value;
        } else {
            if (value >= min) {
                st.push((long) value);
            } else {
                st.push(2L * value - min);
                min = value;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        }

        long num = st.pop();

        if (num < min) {
            min = 2 * min - num;
        }
    }

    public int top() {
        long num = st.peek();

        if (num < min) {
            return (int) min;
        }

        return (int) num;
    }

    public int getMin() {
        return (int) min;
    }
}