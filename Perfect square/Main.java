import java.util.*;
class Main
{
static boolean checkPerfectSquare(double number)    
{   
 
double sqrt=Math.sqrt(number);   

return ((sqrt - Math.floor(sqrt)) == 0);   
}   

public static void main(String[] args)    
{   
  

Scanner sc=new Scanner(System.in);  

double number=sc.nextDouble();   

if (checkPerfectSquare(number))   
System.out.print("YES");   
else  
System.out.print("NO");   
}   
}   