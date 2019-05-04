import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String sub=in.nextLine();
    System.out.println(remove(str,sub));
   }
  public static String remove(String str,String sub)
  {
    int count[]=count_array(sub);
    int i=0,res=0;
    char arr[]=str.toCharArray();
    while(i!=arr.length)
    {
      char temp=arr[i];
      if(count[temp]==0)
      {
        arr[res]=arr[i];
        res++;
      }
      i++;
    }
    str=new String(arr);
    return str.substring(0,res);
  }
  public static int[] count_array(String str)
  {
    int count[]=new int[256];
    for(int i=0;i<str.length();i++)
    {
      count[str.charAt(i)]++;
    }
    return count;
  }
}