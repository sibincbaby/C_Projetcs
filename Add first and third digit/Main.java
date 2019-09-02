#include<stdio.h>
int main()
{
  int t,f,sum,num;
  scanf("%d",&num);
  f=num/100;
  t=num%10;
  sum=f+t;
  printf("%d",sum);
  //Type your code here
  return 0;
}