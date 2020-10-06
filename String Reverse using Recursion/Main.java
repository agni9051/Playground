import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    System.out.print(reverse(s));
  }
  static String reverse(String str)
  {
    if(str.isEmpty())
      return str;
    else
      return reverse(str.substring(1)) + str.charAt(0);
  }
}