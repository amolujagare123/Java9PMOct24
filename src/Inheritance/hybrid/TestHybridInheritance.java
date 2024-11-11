package Inheritance.hybrid;

class Animal
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Mamal extends Animal
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal
{
    void crawl()
    {
        System.out.println("crawl");
    }
}
class Tiger extends Mamal
{
    void roar()
    {
        System.out.println("roar");
    }
}



public class TestHybridInheritance {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Mamal m = new Mamal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crawl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();



    }
}
