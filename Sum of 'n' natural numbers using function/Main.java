#include<stdio.h>
int sqnum(int);
int main() 

{
  int num1,result;
  scanf("%d",&num1);
 result=sumnum(num1);
  printf("%d",result);
   return 0;
}

int sumnum(int num)
{
  int i,sum=0;
  for(i=1;i<=num;i++)
  {
  sum=sum+i;
  }
  return sum;
}