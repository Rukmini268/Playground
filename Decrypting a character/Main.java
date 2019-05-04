import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      if(ch>='a' && ch<='z') 
      {
        int offset='z'-ch; 
        offset=(offset+key)%26;
        ch=(char) ('z'-offset); 
      }
      else if(ch>='A' && ch<='Z')
      {
        int offset='Z'-ch; 
        offset=(offset+key)%26;
        ch=(char) ('Z'-offset) ;
      }
      System.out.print(ch);
    }
}