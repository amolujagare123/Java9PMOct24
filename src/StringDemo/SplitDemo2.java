package StringDemo;

public class SplitDemo2 {
    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] stArr = str.split("");

        // print only the words that ends with y

        for (int i=0 ; i< stArr.length ; i++) {

            int l  =  stArr[i].length();

            if(stArr[i].charAt(l-1)=='y')
                        System.out.println(stArr[i]);

        }

    }
}
