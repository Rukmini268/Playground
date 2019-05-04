import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int count=in.nextInt();
    StringBuilder sb=new StringBuilder(str);
    int sb_len=sb.length();
    delete(sb,sb_len);
    sb_len=sb.length();
    int row=sb_len/count;
    if((sb_len%count)>0)
    {
      row++;
    }
    for(int i=0;i<count;i++)
    {
      for(int j=0;j<row;j++)
      {
        int current=i+(j*count);
        if(j%2==1)
        {
          int chat=(count-1)+(j*count);
          current=chat-i;
        }
        char ch;
        if(current>=sb_len)
        {
          ch='X';
        }
        else
        {
          ch=sb.charAt(current);
        }
        System.out.print(ch);
      }
    }
  }
  public static void delete(StringBuilder sb,int sb_len)
  {
    StringBuilder temp=new StringBuilder("");
    for(int i=0;i<sb_len;i++)
    {
      if(sb.charAt(i)!=' ')
      {
        temp.append(sb.charAt(i));
      }
    }
    sb.setLength(0);
    int temp_len=temp.length();
    for(int i=0;i<temp_len;i++)
    {
      sb.append(temp.charAt(i));
    }
    }
  }
