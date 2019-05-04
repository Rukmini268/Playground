import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str); 
      int str_len=sb.length();
      int stat[]=new int[26];
      for(int i=0;i<25;i++)
      {
        stat[i]=0;
      }
      for(int i=0;i<str_len;i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') 
        {
          stat[sb.charAt(i)-'A']++;
        }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z') 
        {
          stat[sb.charAt(i)-'a']++;
        }
      }
       for(int j=0;j<=25;j++)
       {
         if(stat[j]==0)
         {
           char missing=(char) (j+'a'); 
           System.out.print(missing+" ");
         }
     }
    }
}