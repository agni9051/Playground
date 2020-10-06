import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int l = s.length();
    if(l<=20)
    {
      char c[]=s.toCharArray();
      int len=c.length;
      for(int i=0;i<len;i++)
      {
        int ct=1;
        for(int j=i+1;j<l&&(c[i]==c[j]);j++)
        {
          ct++;
          c[j]='0';
        }
        if(c[i]!='0')
          System.out.print(c[i]+""+ct);
      }
    }
    else
      System.out.print("Invalid Input");
  }
}