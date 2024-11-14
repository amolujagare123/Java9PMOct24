package Abstraction;

interface MyInterface
{
     void start();
     void run();

   default void display()
    {
        System.out.println("display");
    }

    static void display1()
    {
        System.out.println("display");
    }

    private void display2()
    {
        System.out.println("display2");
    }
}

class ChildInterface implements MyInterface
{
    public void start() {
        System.out.println("start");
    }


    public  void run() {
        System.out.println("run");
    }

}


public class TestInterface {

    public static void main(String[] args) {

        MyInterface mi = new ChildInterface();
        mi.run();
        mi.start();
        mi.display();

        MyInterface.display1(); // display1 - static

    }
}
