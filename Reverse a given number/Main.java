import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num,n,rev=0;
    num=sc.nextInt();
    //String s = Integer.toString(num);
    //int l = s.length();
    //String s1="";
    //for(int i=l-1;i>=0;i--)
    //{
      //if(s.charAt(i)!='0')
        //s1=s1+s.charAt(i);
    //}
    while(num!=0)
        {
            n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
    System.out.print(rev);
  }
}