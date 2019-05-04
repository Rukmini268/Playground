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
     int freq[]=new int[n];
     System.out.print(freqe(arr,n,freq));
  }
  public static int freqe(int arr[],int n,int freq[])
  {
  int max=0;
  int count=1;
  for(int i=0;i<n;i++)
  {
  for(int j=i+1;j<n;j++)
  {
  if(arr[i]==arr[j])
  count++;
  }
  freq[i]=count;
  count=1;
  }
  for(int i=0;i<n;i++)
  {
  if(freq[i]>freq[max])
  max=i;
  }
  return arr[max];
  }
  }
