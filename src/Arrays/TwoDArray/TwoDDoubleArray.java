package Arrays.TwoDArray;

public class TwoDDoubleArray {

    public static void main(String[] args) {
        double[][] a = new double[4][3];

        a[0][0] = 1.1;
        a[0][1] = 2.1;
        a[0][2] = 3.1;

        a[1][0] = 1.4;
        a[1][1] = 2.5;
        a[1][2] = 3.6;

        a[2][0] = 2.4;
        a[2][1] = 3.5;
        a[2][2] = 4.6;

        a[3][0] = 2.1;
        a[3][1] = 3.2;
        a[3][2] = 4.3;

        int row = a.length;
        int col = a[0].length;

      for(int i=0;i<a.length;i++) {
          for (int j = 0; j < a[0].length; j++) {
              System.out.print(a[i][j]+"\t");
          }
         System.out.println();
      }

    }
}
