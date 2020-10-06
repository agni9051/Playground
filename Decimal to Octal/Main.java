import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(DectoOct(n));
  }
  static int DectoOct(int decimal)
  {
    int res=0;
    int i=1,r;
  while (decimal > 0)
        {
    		r = decimal%8; 
            res = res*10+r;
            decimal /= 8;
            //i *= 10;
        }
    int rem,octal=0;
    while (res > 0)
        {
    		rem = res%10; 
            octal = octal*10+rem;
            res =res/10;
            //i *= 10;
        }
		return octal;
  }
}