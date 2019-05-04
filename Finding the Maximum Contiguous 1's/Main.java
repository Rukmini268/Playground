import java.util.Scanner;
public class Main
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
      int id=repeat(arr,n,freq);
      int max=max_ind(freq,n,id);
      System.out.print(max);
    }
  public static int repeat(int arr[],int n,int freq[])
  {
    int i;
    int count=0;
    int freq_id=0;
    for(i=0;i<n;i++)
    {
      if(arr[i]==1)
      {
        count++;
      }
      if((arr[i]==0)||(i==n-1))
      {
      freq[freq_id]=count;
      count=0;
      freq_id++;
    }
  }
  return freq_id-1;
}
public static int max_ind(int freq[],int n,int id)
{
  int max_no=0;
  if((freq[0]>freq[1])||(id==0))
  {
    max_no=freq[0];
   }
  else
  {
    max_no=freq[1];
  }
  for(int i=2;i<id;i++)
  {
    if(max_no<freq[id])
    {
    max_no=freq[id];
    }
  }
  return max_no;
}
}
    
