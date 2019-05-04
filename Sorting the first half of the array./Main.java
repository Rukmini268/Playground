import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int temp[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
   for(int i=0;i<n-1;i++)
   {
    for(int j=0;j<n/2-1;j++)
    {
      if(arr[j]>arr[j+1])
      {
        temp[j]=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp[j];
      }
    }
   }
     for(int i=0;i<n;i++)
    {
    System.out.print(arr[i]+" ");
    }
    }
 }

 