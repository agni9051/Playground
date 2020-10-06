import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String rev="";
    int l=s.length();
    for(int i=l-1;i>=0;i--)
    {
      rev=rev+s.charAt(i);
    }
    char a[]=rev.toCharArray();
    int len=a.length;
    for(int i=0;i<l;i++)
    {
      for(int j=i+1;j<l;j++)
      {
        if(a[i]==a[j])
          a[j]='0';
      }
      if(a[i]!='0')
        System.out.print(a[i]);
    }
  }
}