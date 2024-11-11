package Inheritance.superDemo;

class Employee {
     int salary = 45000;

     void empWork()
    {
        System.out.println("empWork");
    }
}

class Programmer extends Employee {
     int bonus = 10000;
    int salary = 70000;
     void empWork()
     {
         System.out.println("programmer is also employee");
     }

    void programmerWork() {
        System.out.println("empWork");
        super.salary = 90;
    }

    void myMethod()
    {
        System.out.println("salary="+salary);
        empWork();
    }
}

class Tester extends Programmer
{
    int salary = 75000;

    void testMethod()
    {
        System.out.println(super.salary);
    }

}

public class TestSuper {

    public static void main(String[] args) {

       // Programmer p = new Programmer();
      //  System.out.println(p.salary);
       // p.myMethod();

        Tester t = new Tester();
        t.testMethod();
    }
}
