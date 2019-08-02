#include<stdio.h>
int main()
{
int a;
  scanf("%d",&a);
  int p=a%10;
  int q=a/10;
  int r=p+q;
  printf("%d",r);
  return(0);
}