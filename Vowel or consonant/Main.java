import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    String str=s.toUpperCase();
    for(int i=0;i<str.length();i++)
    {
      char c = str.charAt(i);
    if(c =='A'||c == 'E' ||c == 'I'||c =='O'||c =='U')
    {
    	System.out.print("Vowel");
    }
    else
    {
      System.out.print("Consonant");
    }
    }
  }
}