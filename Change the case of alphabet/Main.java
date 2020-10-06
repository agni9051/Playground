import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int l = s.length();
    for(int i=0;i<l;i++)
    {
      char c = s.charAt(i);
      if(Character.isUpperCase(c))
      {
        char res = Character.toLowerCase(c);
    	System.out.print(res);
      }
      else
      {
        char res = Character.toUpperCase(c);
    	System.out.print(res);
      }
  }
}
}