package classDemo;

import java.util.Scanner;

public class MyClass3 {
    int a;
    double d;
    char c;
    String str; // data members


    MyClass3(int a1,double d1,char c1,String str1)
    {
       a = a1;
       d = d1;
       c = c1;
       str = str1;
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


        MyClass3 ob = new MyClass3(12,23.45,'h',"iphone");

        ob.display();







    }

}
