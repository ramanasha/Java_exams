class new {
  public static void main(String[] args) {
int[][] x=new int[5][];
x[0]=new int [3];
x[1]=new int [2];
x[2]=new int [5];
x[3]=new int [4];
x[4]=new int [6];

x[0][1] =10;
x[0][0] =10;
x[0][2] =10;

x[1][1] =10;
x[1][0] =10;

      for (int i=0; i<x.lenght; i++ ) {
        for (int j=0; j<x[i].length; j++ ) {
          System.out.println(x[i][j]);


        }

      }










  }
}
