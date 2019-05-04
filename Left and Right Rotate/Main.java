import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in); 
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=(n-1);i++)
    {
      arr[i]=in.nextInt();
    }
    int rotate=in.nextInt();
    left_even(n,arr,rotate);
    right_odd(n,arr,rotate);
    for(int i=0;i<=(n-1);i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
  public static void left_even(int n, int arr[],int rotate) 
  {
    int first_even=1;
    int last_even;
    if(n%2==0)
    {
      last_even=n-1;
    }
    else 
    {
      last_even=n-2;
    }
    for(int r=1;r<=rotate; r++)
    {
      int temp=arr[first_even];
      for(int i=3;i<n;i=i+2)
      {
        arr[i-2]=arr[i];
      }
      arr[last_even]=temp; 
    }
  }
  public static void right_odd(int n, int arr[],int rotate) 
  {
    int first_odd=0;
    int last_odd;
    if(n%2==1)
    {
      last_odd=n-1;
    }
    else
    {
      last_odd=n-2;
    }
    for(int r=1;r<=rotate; r++)
    {
      int temp=arr[last_odd];
      for(int i=(last_odd-2);i>=0;i=i-2)
      {
      arr[i+2]=arr[i];
    }
    arr[first_odd]=temp; 
  }
  }
}