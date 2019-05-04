import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System. in); 
      int n=in.nextInt();
      int arr[]=new int[n]; 
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int left=0;
      int right=n-1;
      boolean palindrome=true; 
      while(left<=right)
      {
        if(arr[left]!=arr[right])
        {
          palindrome=false;
          break; 
        }
        left++;  
         right--; 
      }
      if(palindrome==true) 
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}