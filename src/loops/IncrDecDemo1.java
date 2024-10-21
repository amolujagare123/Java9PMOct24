package loops;

public class IncrDecDemo1 {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i++);// 10
        System.out.println(i);// 11
        System.out.println(++i);// 12
        System.out.println(i); // 12

       // i++ / i- - : First the statement is executed
        // then increment or decrement happens.

       // ++i / - -i : First the increment or decrement
        // happens then the statement is executed.


    }
}
