import java.util.Scanner;
class Main
{
  public static int sqr(int m) 
  {
    int s=m*m;
    return s; 
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=sqr(n);
      System.out.println(m);
	} 
}