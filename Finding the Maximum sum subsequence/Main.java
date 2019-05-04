import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[20];
    int i,j;
    for(i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    System.out.print(sum(arr,n));
  }
  public static int sum(int arr[],int n)
  {
    int run,max_sum,i;
    run=arr[0];
    max_sum=arr[0];
    for(i=1;i<n;i++)
    {
      if(arr[i]>arr[i-1])
      {
        run+=arr[i];
      }
        else
        {
        run=arr[i];
        }
      if(run>max_sum)
      {
        max_sum=run;
      }
    }
    return max_sum;
   }
}