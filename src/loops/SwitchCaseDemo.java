package loops;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a ;
        int b ;
        int c;
        String operation ="";
        String choice ="";

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter a = ");
            a = sc.nextInt();
            System.out.println("Enter b = ");
            b = sc.nextInt();
            System.out.println("Enter Operation = ");
            operation = sc.next();


            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

                default:
                    System.out.println("wrong choice");
                      break;
            }

            System.out.println("Do you want to continue (Y/N)");
            choice = sc.next();
        }
       // while (choice.equalsIgnoreCase("n")!=true);
        while (!choice.equalsIgnoreCase("n"));

    }
}
