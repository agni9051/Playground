import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>30)
    {
      System.out.print("Invalid Input");
    }
    else
    {
      System.out.print(Sum(n));
    }
  }
  static int Sum(int a)
  {
    if(a==1||a==2)
      return a;
    else
      return Sum(a-1)+Sum(a-2);
  }
}