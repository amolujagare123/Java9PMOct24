package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;

        Integer ii1 = new Integer(5);
        Integer ii2 = new Integer(i); // boxing or wrapping

        System.out.println("i="+i);
        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        Integer ii3 = 5;
        Integer ii4 = i; // auto boxing or auto wrapping
        System.out.println("ii3="+ii3);
        System.out.println("ii4="+ii4);

        Integer myInt = new Integer(10);
        int j1 = myInt.intValue(); // unboxing / unwrapping
        int j2 = myInt;// auto unboxing / auto unwrapping

        System.out.println("myInt="+myInt);
        System.out.println("j1="+j1);
        System.out.println("j2="+j2);


    }
}
