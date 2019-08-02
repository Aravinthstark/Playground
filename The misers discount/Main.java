#include<stdio.h>
int main()
{
 float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
 float g=a+b;
  float h=(g*c)/100;
  float j=g-h;
 printf("%.2f\n",(float)g);
  printf("%.2f\n",(float)j);
  printf("%.2f\n",(float)h);
  return(0);
  
}