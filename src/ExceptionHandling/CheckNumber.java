package ExceptionHandling;

public class CheckNumber {

    void numberCheck(int num)
    {
        if(num>=1 && num<=10)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 14;
        System.out.println("lets start checking");

        CheckNumber ob = new CheckNumber();
        ob.numberCheck(a);

        System.out.println("end of the program");
    }

}
