package Inheritance.Polymorphism;

class TVShowroom
{
    void channels()
    {
        System.out.println("TVShowroom channels");
    }

    void volumeControl()
    {
        System.out.println("TVShowroom volumeControl");
    }

    void settings()
    {
        System.out.println("TVShowroom settings");
    }
}

class LG extends TVShowroom
{
    void channels()
    {
        System.out.println("LG channels");
    }

    void volumeControl()
    {
        System.out.println("LG volumeControl");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}

class Samsung extends TVShowroom
{
    void channels()
    {
        System.out.println("Samsung channels");
    }

    void volumeControl()
    {
        System.out.println("Samsung volumeControl");
    }

    void settings()
    {
        System.out.println("Samsung settings");
    }
}

class Onida extends TVShowroom
{
    void channels()
    {
        System.out.println("Onida channels");
    }

    void volumeControl()
    {
        System.out.println("Onida volumeControl");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}


public class TestTVShowroom {

    public static void main(String[] args) {

        TVShowroom tv1 = new LG();

        tv1.channels();
        tv1.volumeControl();
        tv1.settings();


        TVShowroom tv2 = new Samsung();

        tv2.channels();
        tv2.volumeControl();
        tv2.settings();

        TVShowroom tv3 = new Onida();

        tv3.channels();
        tv3.volumeControl();
        tv3.settings();

    }

}

