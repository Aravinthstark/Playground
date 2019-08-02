#include<stdio.h>
int main()
{
int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int r=(a*b/100);
  printf("%d\n",r);
  int s=(a-r);
  int t=(c*s/100);
  int  u=r+t;
  int v=(a-u)/3;
  printf("%d\n",t);
  printf("%d\n",v);
  return(0);
  
}