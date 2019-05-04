import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=m;j>m-i;j--)
        {
          System.out.print(j);
        }
        for(int j=1;j<=m-i;j++)
        {
          System.out.print(n-i+1);
        }
        System.out.println();
      }
   }
}