import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(GeoS(n));
  }
  static int GeoS(int a)
  {
    if(a==1||a==2)
      return 1;
    else
    {
      if(a%2==0)
      {
        a=a/2;
        int m=a-1;
        return ((int)Math.pow(3,m));         
      }
      else
      {
        a=a/2;
        return ((int)Math.pow(2,a));
      }
    }
  }
}