import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i>j)
        {
          arr[i][j]=0;
        }
      }
    }
    int i,j;
     for(int k = 0; k < c; k++)
        {
  	        for(i = 0, j = k; j < c ; i++, j++)
    	    System.out.print(arr[i][j]+" ");
        }
  }
}