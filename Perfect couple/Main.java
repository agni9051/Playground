import java.util.*;
public class Main
{
public static void main(String args [])
{
Scanner in = new Scanner (System.in) ;
int size = in.nextInt();
  int [] arr= new int[50];
  int i;
    for(i=0; i<size; i++)
    {
   arr[i] = in.nextInt();
    }
    
  int sum= in.nextInt();
    
  check_sum_and_display(arr, size, sum);
 
}


public static void check_sum_and_display(int arr[], int size, int sum)
{
    int i,j;
    boolean flag = false;
    for(i=0; i<size-1; i++)
    {
        for(j=i+1; j<size; j++)
        {
            if(sum == (arr[i] + arr[j]))
            {
               	System.out.println("Perfect couple: "+arr[i]+" "+arr[j]); 
                System.exit(0);
            }
        }
    }
 System.out.println("No perfect couple found!");
}
}