package classDemo;

public class Student {

    int rno;
    String name;
    String branch;

    void  display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("branch="+branch);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rno = 1;
        s1.name = "vidya";
        s1.branch = "IT";

        Student s2 = new Student();
        s2.rno = 2;
        s2.name = "Makarand";
        s2.branch = "Comp";

        s1.display();
        s2.display();
    }

}
