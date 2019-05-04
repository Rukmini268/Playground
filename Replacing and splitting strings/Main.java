import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int n=in.nextInt();
      String str3=str1.replace(str1,str2);
      String flag[]=str3.split(" ",n);
      for(String res: flag)
      System.out.println(res);
      
        
    }
}