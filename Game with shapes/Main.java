#include<stdio.h>
int main()
{
int a,b;
  scanf("%d%d",&a,&b);
  int c=(3.14*a*a);
  int d=b*b;
  if (c>=d)
  {
    printf("circle cannot be inside a Square");
  }
  else
  {
    printf("circle can be inside a square");
  }
}