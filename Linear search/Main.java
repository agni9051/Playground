#include <stdio.h>
int main()
{
  int array[100], search, i, n;
  scanf("%d", &n);
  for (i=0;i<n;i++)
    scanf("%d", &array[i]);
  
  scanf("%d", &search);
  for (i=0;i<n;i++)
  {
    if (array[i] == search)    
    {
      printf("%d",i+1);
      break;
    }
  }
  if (i==n)
    printf("%d isn't present in the array.\n", search);
  return 0;
}