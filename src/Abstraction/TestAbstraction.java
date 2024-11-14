package Abstraction;

abstract class Parent
{
    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }
}

class Child extends Parent
{

    void start() {
        System.out.println("start");
    }


   void run() {
        System.out.println("run");
    }
}

class Child2 extends Child
{

}


public class TestAbstraction {

    public static void main(String[] args) {
       // Parent p = new Parent();

        Parent p = new Child2();
        p.start();
        p.run();
        p.display();
    }
}
