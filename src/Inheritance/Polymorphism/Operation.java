package Inheritance.Polymorphism;

public class Operation {

    int a;
    int b;

    void addition()
    {
        int c ;
        c = a + b ;
        System.out.println("c="+c);
    }

    void addition(int x)
    {
        int c ;
        c = x + b ;
        System.out.println("c="+c);
    }
    void addition(int x,int y)
    {
        int c ;
        c = x + y ;
        System.out.println("c="+c);
    }

    void addition(int x,int y, int z)
    {
        int c ;
        c = x + y +z;
        System.out.println("c="+c);
    }

    void addition(double x,double y)
    {
        double c ;
        c = x + y ;
        System.out.println("c="+c);
    }

    void addition(String x,String y)
    {
        String c ;
        c = x + y ;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {

        Operation ob = new Operation();
        ob.addition();
        ob.addition(34);
        ob.addition(34,26);
        ob.addition(34,26,100);
        ob.addition(34.56,2.6);
        ob.addition("Test","Project");
    }
}
