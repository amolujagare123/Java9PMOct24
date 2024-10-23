package Arrays;

public class IntArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 34;
        a[1] = 55;
        a[2] = 99;
        a[3] = 125;
        a[4] = 111;

        for(int x:a)
        {
            System.out.println(x);
        }

        /*for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }*/

       /* System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/
    }
}
