import java.util.*;
class Main
{
  public static void main(String args[])
  {
  	Scanner sc = new Scanner(System.in);
    String v = sc.nextLine();
    String c = sc.nextLine();
    String s = sc.nextLine();
    String l_u = s.toUpperCase();
    String str = Vow(v)+Con(c)+l_u;
    String q = str.replaceAll("\\s", "");
    System.out.print(q);
  }
  static String Vow(String s1)
  {
    for(int i=0;i<s1.length();i++)
    {
      char c = s1.charAt(i);
      if( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' ||
         c == 'i' || c == 'o' || c == 'u')
      {
         String front = s1.substring(0,i);
      	 String back = s1.substring(i+1);
      	s1 = front +"$"+back;
      }
    }
    return s1;
  }
  static String Con(String s2)
  {
    for(int i=0;i<s2.length();i++)
    {
      char c = s2.charAt(i);
      if( c == 'A' || c == 'E' || c == 'I' || c == 'O' ||  c == 'U' || c == 'a' || c == 'e' ||
         c == 'i' || c == 'o' || c == 'u');
        else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
        {
          String front = s2.substring(0,i);
      	  String back = s2.substring(i+1);
      	  s2 = front +"#"+back;
        }
    }
    return s2;
  }
}