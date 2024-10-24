package Arrays;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {12,45,67,89,11,23,78,90,11,556,81};
        
        int l = a.length;

        System.out.println("l="+l);

       /* for(int x:a)
        {
            System.out.println(x);
        }*/

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

       /* System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/
    }
}
