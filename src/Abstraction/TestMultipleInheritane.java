package Abstraction;

interface MyInterface1
{
    void start();
    void run();
    void display();

    default void display1()
    {
        System.out.println("display11 MyInterface1");
    }

}

interface MyInterface2
{
    void display();
    default void display1()
    {
        System.out.println("display12 MyInterface2");
    }
}

class ChildInterface2 implements  MyInterface2,MyInterface1
{

   public void display1()
    {
        System.out.println("display12 child");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    public void display() {
        System.out.println("display");
    }


}


public class TestMultipleInheritane {
    public static void main(String[] args) {

        MyInterface1 ob1 = new ChildInterface2();
        ob1.display();
        ob1.display1();

        MyInterface2 ob2 = new ChildInterface2();
        ob2.display();
        ob2.display1();

        ChildInterface2 ob = new ChildInterface2();
        ob.display1();
    }
}
