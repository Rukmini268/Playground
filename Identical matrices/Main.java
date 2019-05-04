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
    int mat[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        mat[i][j]=in.nextInt();
      }
    }
    int flag=1;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(arr[i][j]!=mat[i][j])
        {
          flag=0;
          break;
        }
      }
    }
    if(flag==1)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
    
  }
}