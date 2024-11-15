package FinalNStatic;

public class Student {

    int rno;
    String name;
    static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 1;
        s1.name = "Srinivas";
      //  s1.display();

        s2.rno = 2;
        s2.name = "Pratik";
        s2.college = "PICT";
     //   s2.display();

        s3.rno = 3;
        s3.name = "Vidya";
    //    s3.display();


     //   System.out.println(Student.college);
        Student.college = "Delhi college";

        s1.display();
        s2.display();
        s3.display();


    }

}
