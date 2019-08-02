#include<stdio.h>
int main()
{
 int a,b,c;
  int dis=100;
  scanf("%d%d%d",&a,&b,&c);
  int p=a*b;
  int q=a*c;
  int r=p-q;
  int s=r-dis;
  printf("%d",s);
  return(0);
}