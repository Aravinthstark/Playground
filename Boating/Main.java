#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=b*75;
  int e=c*30;
  int f=d+e;
  if (f<=a)
  {
    printf("Boat is stable");
  }
  else
  {
    printf("Boat will drow");
  }
}