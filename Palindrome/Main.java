import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r,rev=0;
    int n=sc.nextInt();
    int num=n;
    while(n>0)
    {
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    if(rev==num)
    System.out.print("Palindrome");
    else
    System.out.print("Not a Palindrome");  
  }
}