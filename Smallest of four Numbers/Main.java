import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if(a<b&&a<c&&a<d)
    { 
    	System.out.print(a);
    }
    else if(b<a&&b<c&&b<d)
    { 
    	System.out.print(b);
    }
    else if(c<a&&c<b&&c<d)
    { 
    	System.out.print(c);
    }
    else
    {
      	System.out.print(d);
    }
  }
}