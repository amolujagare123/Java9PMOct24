package loops;

public class IncrDecDemo2 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--);// 10
        System.out.println(i);// 9
        System.out.println(--i);// 8
        System.out.println(i); // 8

       // i++ / i- - : First the statement is executed
        // then increment or decrement happens.

       // ++i / - -i : First the increment or decrement
        // happens then the statement is executed.


    }
}
