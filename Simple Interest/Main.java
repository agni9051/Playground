#include <stdio.h>
int main()
{
   float p,r,SI;
   int n;
   scanf("%f",&p);
   scanf("%d",&n);
   scanf("%f",&r);
   SI=(p*n*r)/100;
   printf("%.6f", SI);
   return 0;
}