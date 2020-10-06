#include <stdio.h>
int main()
{
   int n;
   scanf("%d",&n);
   float r =(float)n/2;
   float PI = 3.14;
   float res=PI*(r*r);
   printf("%.2f",res);
   return 0;
}