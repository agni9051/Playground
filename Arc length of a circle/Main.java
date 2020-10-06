#include <stdio.h>
int main()
{
   float a,b;
   scanf("%f",&a);
   scanf("%f",&b);
   float PI=3.14;
   float s =2*PI*a*(b/360);
   printf("%.2f", s);
   return 0;
}