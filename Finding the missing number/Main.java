import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in. nextInt();
      int arr[]=new int[n]; 
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int missing=0;
      for(int val=1;val<=n; val++)
      {
        boolean found=false;
        for(int i=0;i<=n-1; i++)
        {
          if(arr[i]==val) 
          {
            found=true;
            break; 
          }
        }
        if(found==false) 
        {
          missing=val;
          break; 
        }
      }
     System.out.print(missing);   
    }
}