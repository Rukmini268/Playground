import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fd=n/100;
      int ld=n%10;
      int sum=fd+ld;
      System.out.println(sum);
      
	}
}