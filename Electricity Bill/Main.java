#include<stdio.h>
int main()
{
 int a;
  scanf("%d",&a);
 
  if(a<=200)
  {
    float b = (float)a*0.5;
    printf("Rs.%.0f",b);
  }
  else if(a<=400)
  {
    float c = ((float)a*0.65)+100;
    printf("Rs.%.0f",round(c));
           }
           else if(a<=600)
           {
             float d = ((float)a*0.80)+200;
             printf("Rs.%.0f",d);
           }
  else
  {
    float e = ((float)a*1.25)+425;
    printf("Rs.%.0f",e);
  }
  return 0;
}