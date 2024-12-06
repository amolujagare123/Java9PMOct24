package collectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("Rohit");
        st.push("Priya");
        st.push("Anjali");// 6
        st.push("Sunita");
        st.push("Rahul"); // 4
        st.push("Sneha");
        st.push("Vikram"); // 2
        st.push("Neha");

        System.out.println(st);

        System.out.println(st.search("Vikram"));


     /*   Stack<String> st2 = new Stack<>() {{
            push("amol1");
            push("amol1");
            push("amol1");
        }};*/
    }
}
