package classDemo.pack1;

public class Java1 {

    public int a;
    private double d;
    protected char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 10;
        ob.d = 10.34;
        ob.c = 'j';
        ob.str = "amol";
        ob.display();

    }

}
