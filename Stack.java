
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> st = new java.util.Stack<Integer>();
        // to add elements in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);// topmost element
        System.out.println(st);
        // to know top element of stack
        int top = st.peek();
        System.out.println("Top most elements"+" "+top);
        // to remove element : it will remove peek element
        st.pop();
        System.out.println(st);
        
    }
}
