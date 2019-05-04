import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int freq[]=new int[k];
      for(int i=0;i<=k-1;i++)
      {
        freq[i]=0;
      }
      for(int i=0;i<=n-1;i++)
      {
        freq[arr[i]-1]++;
      }
      for(int i=0;i<=k-1;i++)
      {
        System.out.println((i+1)+" "+freq[i]);
      }      
    }
}