package FinalNStatic;

public class Student2 {

    int rno;
    String name;
    protected static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static  void staticMethod1()
    {
        System.out.println("staticMethod1");

      //  System.out.println("rno="+rno); // non-static - not allowed
      //  System.out.println("name="+name);// non-static - not  allowed
        System.out.println("college="+college);// static - allowed
       // display(); // non-static - not allowed
        staticMethod1(); // static - allowed
        staticMethod2(); // static - allowed
    }

    public  static  void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod2()
    {
        System.out.println("staticMethod2");
        System.out.println("rno="+rno); // non-static - allowed
        System.out.println("name="+name);// non-static - allowed
        System.out.println("college="+college);// static - allowed
        display(); // non-static - allowed
        staticMethod1(); // static - allowed
        staticMethod2(); // static - allowed
    }


    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();

        s1.staticMethod1();
        s1.staticMethod2();
        System.out.println(s1.college);

        Student2.staticMethod1();
        Student2.staticMethod2();
        System.out.println(Student2.college);

        staticMethod2();
        staticMethod1();
        System.out.println(college);



    }

}
