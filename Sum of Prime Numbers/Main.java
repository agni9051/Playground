import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
    int n,i,n1,sum=0;
    n=sc.nextInt();
    n1=sc.nextInt();
    System.out.print(primeSum(n, n1));
  }
  static int primeSum(int l, int r) 
    { 
        int sum = 0; 
        for (int i = l+1; i <= r-1; i++) 
        { 
            boolean isPrime = checkPrime(i); 
            if (isPrime) 
            { 
                sum = sum + i; 
            } 
        } 
        return sum; 
    }
   static boolean checkPrime(int numberToCheck) 
    { 
        if(numberToCheck == 1) 
        { 
            return false; 
        } 
        for (int i = 2; i<= numberToCheck/2; i++) 
        { 
            if (numberToCheck % i == 0) 
            { 
                return false; 
            } 
        } 
        return true; 
    } 
}