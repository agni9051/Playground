import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if(isArms(n))
    System.out.println("ARMSTRONG");
    else
    System.out.println("NOT AN ARMSTRONG");
  }
  static boolean isArms(int no)
  {
    int num=no;
    int r;
    double sum=0;
    int o=order(no);
    while(no>0)
    {
      r=no%10;
      sum=sum+Math.pow(r,o);
      no=no/10;
    }
    return sum==num;
  }
  static int order(int a)
  {
    int count=0;
    while(a>0)
    {
      count++;
      a=a/10;
    }
    return count;
  }
}