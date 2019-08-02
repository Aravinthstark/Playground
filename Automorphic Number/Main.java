#include<stdio.h>
int main()
{
  int a;
 if(a>0)
 {
 scanf("%d",&a);
 }
 else
 {
   printf("Invalid Input");
 }
 int b = a*a;
 int c = b%10;
 if(a==c)
 {
   printf("Automorphic Number");
 }
 else
 {
   printf("Not Automorphic Number");
 }
 return 0;
}
