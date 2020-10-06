#include <stdio.h>
#include <math.h>
int main()
{
   int n,i,flag;
  scanf("%d",&n);
  for(i=2;i<n/2;i++)
  {
    flag=1;
    if(n%i==0)
    {
      flag=0;
      break;
    }
  }
  if(flag==1)
    printf("%.2f", sqrt(n));
  else
    printf("0.00");
  return 0;
}