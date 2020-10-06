#include <stdio.h>
int main()
{
  int n1,n2;
  scanf("%d %d",&n1,&n2);
  for(int i=n1;i<=n2;i++)
  {
    if(n2>=100)
      printf("%03d ",i);
    else if(n2>=10)
      printf("%02d ",i);
    else
      printf("%d ", i);
  }
  return 0;
}