import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in); 
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size]; 
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in. nextInt();
      }
      int  search_elem1=in.nextInt();
      int  search_elem2=in.nextInt();
      int element1=-1;
      int element2 =-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(search_elem1==arr[i])
        {
          element1=i;
        }
        if(search_elem2==arr[i])
        {
          element2=i;
        }
      }
      System.out.println(element1);
      System.out.println(element2);
      }
}