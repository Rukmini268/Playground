import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String str1=in.nextLine();
      StringBuilder sb=new StringBuilder(str); 
      StringBuilder sb1=new StringBuilder(str1); 
      StringBuilder temp=new StringBuilder(" ");
      int sb_len=sb.length();
      int sb1_len=sb1.length();
      for(int i=0;i<=(sb_len-1);i++)
          {
            char ch=sb.charAt(i);
            temp.append(ch);
          }
          for(int i=0;i<=(sb_len-1);i++)
          {
            char ch=sb.charAt(i);
            temp.append(ch);
             }
      int temp_len=temp.length();
      int k=substring_search(temp,temp_len,sb1,sb1_len);
      if(k!=-1){
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
  public static int substring_search(StringBuilder str,int str_len,StringBuilder str1, int str1_len)
  {
    int match=-1;
    for(int j=0;j<(str_len-str1_len+1);j++)
    {
      boolean is_match=true;
      for(int r=0;r<str1_len;r++)
      {
        if(str.charAt(j+r)!=str1.charAt(r))
        {
          is_match=false; 
        }
      }
      if(is_match==true) 
      {
        match=-j; 
        break; 
      }
    }
  return match; 
   }
}