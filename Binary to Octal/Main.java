import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int binary=sc.nextInt();
    System.out.print(binary_to_octal(binary));
  }
   static int binary_to_octal( int binary)
	{
		int  decimal = 0, i = 0,rm;
		while(binary > 0)
		{
          	rm = binary%10;
			decimal+=rm * Math.pow(2,i);
			i++;
			binary=binary/10;
	   }
		i = 1;
        int r,res=0; 
        while (decimal > 0)
        {
    		r = decimal%8; 
            res = res*10+r;
            decimal /= 8;
        }
    	int rem,octal=0;
   		 while (res > 0)
        {
    		rem = res%10; 
            octal = octal*10+rem;
            res =res/10;
        }
		return octal;
     }
}