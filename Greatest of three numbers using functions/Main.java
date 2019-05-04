import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in); 
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gcd(n1,n2,n3));
	}
  public static int gcd(int a, int b, int c) 
  {
    int large=0;
    if(a>b && a>c)
      large=a;
    else if(b>a && b>c)
      large=b;
    else
      large=c; 
  
  return large; 
  }
}