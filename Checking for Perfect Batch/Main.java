import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    perfect(list,n);
  }
  public static void perfect(int list[],int n) 
  {
    boolean is_perfect=true;
    int batch=list[0]+list[1]+list[2];
    for(int i=3;i<=(n-1);i=i+3)
    {
      int current =list[i]+list[i+1]+list[i+2];
      if(current !=batch) 
      {
        is_perfect=false;
      }
    }
    if(is_perfect==true) 
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}