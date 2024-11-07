package Inheritance.demo;

import Inheritance.Employee;

public class Programmer extends Employee
{
    int bonus = 10000;
    void programmerWork()
    {
        System.out.println("empWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();

        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
    }
}
