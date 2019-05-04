import java.util.Scanner;
class Main {
  
    public static int sum(int n)
    {
      int num=0;
       for(int i=0;i<n;i++)
      {
       num =num+(n+1)/2;
      }
      System.out.print(num);
      return 1;
    }
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
    }
}