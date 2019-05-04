import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[][]=new int[n][n]; 
      spirally(arr, n); 
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
      public static void spirally(int arr[][],int n) 
      {
        int val=1;
        int r_min=0,c_min=0;
        int r_max=n-1,c_max=n-1;
        while((r_max>=r_min)&&(c_max>=c_min)) 
        {
          for(int i=c_max;( i>=c_min);i--)
          {
            arr[r_min][i]=val++;
          }
          for(int i=r_min+1;(i<=r_max);i++)
          {
            arr[i][c_min]=val++;
          }
          for(int i=c_min+1;(i<=c_max);i++)
          {
            arr[r_max][i]=val++;
          }
          for(int i=r_max-1;(i>=r_min+1);i--) 
          {
            arr[i][c_max]=val++;
          }
          r_min++;r_max--;c_min++;c_max--;
        }      
      
    }
}