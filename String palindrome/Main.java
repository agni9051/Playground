import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s,rev="";
    s=sc.nextLine();
    int l =s.length();
    for(int i=l-1;i>=0;i--)
    {
      rev=rev+(s.charAt(i));
    }
    if(rev.equalsIgnoreCase(s))
    {
      System.out.print(s+" is a palindrome");
    }
    else
    {
      System.out.print(s+" is not a palindrome");
    }
  }
}