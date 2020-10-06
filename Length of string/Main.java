import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int l = s.length();
    int c=0;
    for(int i=1;i<=l;i++)
    {
      c++;
    }
    System.out.print(c);
  }
}