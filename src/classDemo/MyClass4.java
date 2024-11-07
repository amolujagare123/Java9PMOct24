package classDemo;

import java.util.Scanner;

public class MyClass4 {
    int a;
    double d;
    char c;
    String str; // data members

    // Parameterized constructor with this operator

    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }



    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      /*  System.out.println("Enter a = ");
        int myA = sc.nextInt();*/


        MyClass4 ob = new MyClass4(12,23.45,'h',"iphone");

        ob.display();







    }

}
