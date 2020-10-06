import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.length();
    int c=1;
    for(int i=0;i<l;i++)
    {
      if(s.charAt(i)==' ')
      c++;
    }
    System.out.println(c);
  }
}