import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int sb_len=sb.length();
   int shift=in.nextInt();
    for(int i=0;i<=sb_len-1;i++)
    {
      char ch=sb.charAt(i);
      if(ch>='A' && ch<='Z')
      {
        ch=(char)(ch-shift);
        if(ch<'A')
        {
          ch=(char)(ch+26);
        }
      }
      else if(ch>='a' && ch<='z')
      {
        ch=(char)(ch-shift);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
      }
      sb.setCharAt(i,ch);
  }
    System.out.print(sb);
}
}