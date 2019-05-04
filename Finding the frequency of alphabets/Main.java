import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str); 
      int str_len=sb.length();
      int stat[]=new int[70];
      for(int i=0;i<70;i++)
      {
        stat[i]=0;
      }
      for(int i=0;i<str_len;i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') 
        {
          int offset=sb.charAt(i)-'A'; 
          char ch=(char) ('a'+offset); 
          sb.setCharAt(i,ch); 
        }
        if(sb.charAt(i)>='a'  &&  sb.charAt(i)<='z') 
        {
          stat[sb.charAt(i)-'a']++;
        }
      }
      for(int j=0;j<str_len;j++)
      {
        if(stat[sb.charAt(j)-'a']!=0)
        {
          System.out.print(sb.charAt(j)+""+stat[sb.charAt(j)-'a']+" ");
          stat[sb.charAt(j)-'a']=0;
        }
      }
    }
}