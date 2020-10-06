import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int no=sc.nextInt();
    System.out.println(fib(no));
  }
   static int fib(int n) 
    { 
        int a = 0, b = 1,c=0; 
        if (n == 1) 
            return 0;
     	else if(n==2)
            return 1;
     	else
        {
        for (int i = 3; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return c; 
    } 
  }
}
