import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String a[]={"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
    int l =a.length;
    String s=sc.nextLine();
    for(int i=0;i<l;i++)
    {
      if(a[i].equals(s))
      {
        System.out.print(s+" is a keyword");
        System.exit(0);
      }
    }
    System.out.print(s+" is not a keyword");
  }
}