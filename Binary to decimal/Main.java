import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int c=0,r;
    double s=0;
    while(n>0)
    {
      r=n%10;
      s=s+(r*Math.pow(2,c));
      n=n/10;
      c++;
    }
    int res=(int)s;
     System.out.print(res);
  }
}