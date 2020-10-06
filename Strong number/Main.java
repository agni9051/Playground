import java.util.*;
class Main
{  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n,num,r,s=0;
    num = sc.nextInt();
    n=num;
    while(num>0)
    {
      r=num%10;
      s=s+fact(r);
      num=num/10;
    }
    if(n==s)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
  static int fact(int a)
  {
    int i,fact=1;
    for(i=1;i<=a;i++)
    {
      fact=fact*i;
    }
    return fact;
  }
}