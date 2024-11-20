package methods;

public class MethodReturningValue {

    int methodName()
    {
        int a = 20;
        System.out.println(a);

       // return 10 ;  // or
        return a ;
    }

    double doubleValue()
    {
        double d = 23.45;
        return  d;
    }

    String getMyString()
    {
        String str = "Selenium";

        return str;
    }

    String[] getMyStringArray()
    {
        String[] st = {"amol","sweta","mahesh","vidhya"};

        return st;
    }


    String[][] getMy2DArray()
    {
        String[][] myArray = {
                {"Aarav", "Vihaan", "Vivaan"},
                {"Aanya", "Ishita", "Diya"},
                {"Aditya", "Krishna", "Arjun"},
                {"Ananya", "Meera", "Riya"}
        };

        return myArray;
    }




    public static void main(String[] args) {
        MethodReturningValue ob = new MethodReturningValue();
        ob.methodName();


        int b;
        b = 10;
        System.out.println(b);
        int x;
        x = b;

        ob.methodName();
        System.out.println("ob.methodName()="+ob.methodName());

        int y = ob.methodName();
        System.out.println("y="+y);

        System.out.println("ob.doubleValue()="+ob.doubleValue());
        double d1 = ob.doubleValue();
        System.out.println("d1="+d1);


        String[] myStr = ob.getMyStringArray();

        for (String s: myStr)
            System.out.println(s);

        String[][] myStArr = ob.getMy2DArray();

        System.out.println("==== printing 2 D arrray ====");
        for (int i=0;i< myStArr.length ; i++) {
            for (int j = 0; j < myStArr[0].length; j++) {
                System.out.print(myStArr[i][j]+"\t");
            }
            System.out.println();
        }


    }

}
