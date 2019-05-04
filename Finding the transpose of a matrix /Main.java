import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int col=in.nextInt();
    int matrix[][]=new int[row][col];
    int trans[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        matrix[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        trans[j][i]=matrix[i][j];
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.print(trans[i][j]+" ");
      }
      System.out.println();
    }
  }
}