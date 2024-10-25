package Arrays.TwoDArray;

public class TwoDIntArray2 {

    public static void main(String[] args) {
        int[][] a = {
                {11,21,31}  ,
                {14,25,36},
                {24,35,46},
                {21,32,43}
        };
/*
        a[0][0] = 11;
        a[0][1] = 21;
        a[0][2] = 31;

        a[1][0] = 14;
        a[1][1] = 25;
        a[1][2] = 36;

        a[2][0] = 24;
        a[2][1] = 35;
        a[2][2] = 46;

        a[3][0] = 21;
        a[3][1] = 32;
        a[3][2] = 43;*/

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<a.length;i++) {
          for (int j = 0; j < a[0].length; j++) {
              System.out.print(a[i][j]+"\t");
          }
         System.out.println();
      }

    }
}
