package classDemo;

public class MyClass {
    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int i;
        i = 10;


        MyClass ob = new MyClass();

        ob.a = 10;
        ob.d = 10.34;
        ob.c = 'j';
        ob.str = "amol";
        ob.display();

        MyClass ob2 = new MyClass();

        ob2.a = 120;
        ob2.d = 110.34;
        ob2.c = 'c';
        ob2.str = "JAVA";
        ob2.display();

    }

}
