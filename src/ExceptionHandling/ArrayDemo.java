package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[0] = 10;
            a[1] = 10;
            a[2] = 10;
            a[3] = 10;
            a[4] = 10;
            a[5] = 10;
        }

        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        for (int x:a)
            System.out.println(x);

        System.out.println("end of the program");
    }
}
