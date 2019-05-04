import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int pow=1;
      while(e!=0)
      {
        pow=pow*b;
        --e;
      }
      System.out.println(pow);
    }
}