import java.util.Scanner;
class Main
{
  public static int fact(int n)
  {
    int fac=1;
    for(int i=1;i<=n;i++)
    {
      fac=fac*i;
    }
    System.out.println(fac);
    return 1;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    fact(n);
  }
}