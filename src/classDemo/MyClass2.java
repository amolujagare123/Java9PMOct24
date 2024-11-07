package classDemo;

public class MyClass2 {
    int a;
    double d;
    char c;
    String str; // data members

   /* MyClass2()
    {
        // Empty Constructor
    }*/

    MyClass2()
    {
       a = 22;
       d = 22.22;
       c = 'g';
       str = "mobile";
    }



    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int a = 100;
        double d;
        char c;
        String str;


        MyClass2 ob = new MyClass2();
        //ob.a = 90;

        System.out.println(ob.a);
        System.out.println(a);






    }

}
