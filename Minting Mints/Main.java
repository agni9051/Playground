import java.util.*;
class Main 
{
	public static void main (String[] args) 
    {
		int s,n,sum=0;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		n=sc.nextInt();
	    int a[]=new int[n];
	    a[0]=sum=s;
	    for(int i=1;i<n;i++)
	    {
		a[i]=sum-1;
		sum=sum+a[i];
	    }
	    System.out.print(sum);
	}
}