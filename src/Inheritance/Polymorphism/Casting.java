package Inheritance.Polymorphism;

public class Casting {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double c = (double) a/b;
        // if you want to store one type of value into
        // another type then use that type into round brackets
        // in front of value tto be stored
        // this is known as type casting
        // this can be done within same category (premitive/non-Primitive) of datatype

        System.out.println("c="+c);
    }
}
