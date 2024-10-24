package Arrays.TwoDArray;

public class TwoDIntArray {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

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
        a[3][2] = 43;

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
