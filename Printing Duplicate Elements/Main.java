import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j;
    int arr[] = new int [n];
    for(i =0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for (i = 0; i < n; i++) 
    {
      int c=0;
         for (j = 0; j < n; j++)
         {
         if (arr[i] == arr[j]&&i!=j)
         {
            c++;
           arr[j]=0;
            break;
         }
      }
      if (c == 1 && arr[i]!=0)
         System.out.print( arr[i] + " ");
   }
}
}