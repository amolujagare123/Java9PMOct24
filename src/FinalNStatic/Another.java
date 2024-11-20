package FinalNStatic;

import static FinalNStatic.Student2.staticMethod1;
public class Another {

    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.staticMethod1();
        Student2.staticMethod1();

        staticMethod1();

    }

}

