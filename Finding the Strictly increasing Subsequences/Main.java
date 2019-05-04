import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n]; 
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int sum[]=new int[3*n];
    subarray(arr,n,sum);
  }
  public static void  subarray(int arr[],int n, int sum[])
  {
    for(int i=0;i<=n-1;i++)
    {
      int key=arr[i];
      int flag=1;
      for(int j=i+1;j<=n-1;j++)
      {
        if(arr[j]>key) 
        {
          for(int k=i;k<=j;k++)
          {
            if(arr[k]>arr[j])
              flag=0;
          }
          if(flag==1)
            System.out.println(key+","+arr[j]+" ");
        }
        flag=1;
      }
    }
  }
}