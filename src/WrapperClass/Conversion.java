package WrapperClass;

public class Conversion {
    public static void main(String[] args) {

        String s1 = "22";
        String s2 = "45";
        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i1+i2);

        String s3 = "22.56";
        String s4 = "45.11";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        String s5 = "False";
        boolean result = Boolean.parseBoolean(s5);

        if(result)
            System.out.println("result is true");
        else
            System.out.println("result is false");

        String s6 = "a";
        char ch = s6.charAt(0);
        System.out.println("ch="+ch);





        /*int a = 10;
        int b = 11;
        System.out.println(a+b);*/
    }
}
