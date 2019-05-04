import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in); 
      int n=in.nextInt();
      int ft=n/10;
      int lt=n%10;
      int sum=ft+lt;
      System.out.println(sum);
      
	}
}