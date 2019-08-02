#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  int x=a%d;
  int y=b%d;
  int z=c%d;
  if(x==0)
  {
    printf("Car 1 goes into road A");
  }
  else if(y==0)
  {
    printf("Car 1 goes into road B");
  }
  else if(z==0)
  {
    printf("Car 1 goes into road C");
  }
  else
  {
    printf("No path exist");
  }
}