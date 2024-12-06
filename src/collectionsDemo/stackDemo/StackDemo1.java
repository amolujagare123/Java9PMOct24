package collectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Rohit");
        st.push("Priya");
        st.push("Anjali");
        st.push("Sunita");
        st.push("Rahul");
        st.push("Sneha");
        st.push("Vikram");
        st.push("Neha");

        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

    }
}
