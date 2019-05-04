import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    str=str.replaceAll("[AaEeIiOoUu]","");
    System.out.println(str);
  }
}