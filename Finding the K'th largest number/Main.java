import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int k=in.nextInt();
      selection(n,arr);
      System.out.println(arr[n-k]);
    }
  public static void selection(int n,int arr[])
  {
    for(int i=0;i<=n-2;i++)
    {
      int min=find(i,arr,n-1);
      swap(i,min,arr);
    }
  }
  public static void swap(int i,int min,int arr[])
  {
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
  }
  public static int find(int i,int arr[],int j)
  {
    int min=0;
    if(arr[i]<arr[i+1])
    {
      min=i;
    }
    else
    {
      min=i+1;
    }
    for(int k=i+2;k<=j;k++)
    {
      if(arr[min]>arr[k])
      {
        min=k;
      }
    }
    return min;
    }   
}