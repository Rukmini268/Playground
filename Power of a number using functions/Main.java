import java.util.Scanner; 
class Main{
  public static void main(String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    System.out.print(power_number(n,m));
    }
    public static int  power_number(int base, int exponent) 
      {          
        int power=1;
        while(exponent>=1)
        {
          power=power*base;
          exponent--; 
        }
        return power; 
      }      
    }
    