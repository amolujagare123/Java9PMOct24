import java.util.Scanner;

public class AdditionInputFromConsole {

    public static void main(String[] args) {

        int a  ;
        int b ;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a = ");
        a = sc.nextInt();

        // for decimal value - use sc.nextDouble()

        System.out.println("Enter b = ");
        b = sc.nextInt();

        c = a + b;

        System.out.println("Addition="+c);
    }
}
