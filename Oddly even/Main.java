import java.util.*;
 class Main
    {
	public static void main(String[] args) 
        {
	    Scanner sc = new Scanner(System.in);
	    String s=sc.nextLine();	
      	char a[]=s.toCharArray();
      	int l = a.length;
        long num = 0, num1 = 0;
	    for(int i=0;i<l;i++)
	    {
		if(i%2==0)
		    num = num + a[i]-'0';
		else
		    num1 = num1 + a[i]-'0';
	    }
	    System.out.println(Math.abs(num-num1));
		}
    }