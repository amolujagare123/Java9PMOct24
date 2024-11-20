package methods;

public class MethodsArguments {

    int a;
    int b;

    void add() // no arguments
    {
        int c;
        c = a + b ;
        System.out.println("c="+c);
    }
    void add2(int x) // no arguments
    {
        int c;
        c = x + b ;
        System.out.println("c="+c);
    }

    void add3(int x,int y) // no arguments
    {
        int c;
        c = x + y ;
        System.out.println("c="+c);
    }
    void add4(int x,int y,int z) // no arguments
    {
        int c;
        c = x + y + z;
        System.out.println("c="+c);
    }

    void addPrint(int x,int y,String z) // no arguments
    {
        int c;
        c = x + y ;
        System.out.println("c="+c);
        System.out.println("z="+z);
    }

    void printMyArray(int[] a)
    {
        System.out.println("==== printing the arrray ====");
        for(int x:a)
            System.out.print(x+"\t");

        System.out.println();
    }

    void printTwoDArray(String[][] stArr)
    {
        System.out.println("==== printing 2 D arrray ====");
        for (int i=0;i< stArr.length ; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        MethodsArguments ob = new MethodsArguments();
        ob.add();
        ob.add2(34);
        ob.add3(23,45);
        ob.add4(12,34,56);
        ob.addPrint(12,34,"amol");

        int[] arr = {34,5,67,88,11,23,14,90};

        ob.printMyArray(arr);

        String[][] myArray = {
                {"Aarav", "Vihaan", "Vivaan"},
                {"Aanya", "Ishita", "Diya"},
                {"Aditya", "Krishna", "Arjun"},
                {"Ananya", "Meera", "Riya"}
        };
        ob.printTwoDArray(myArray);

    }
}
