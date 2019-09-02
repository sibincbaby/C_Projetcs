#include<stdio.h>
int power(int base,int exp);
int main()
{ 
  int num1,num2,res;
  scanf("%d%d",&num1,&num2);
  res=power(num1,num2);
   printf("%d",res);
  	return 0;
}
int power(int base,int exp)
{
  int i,result;
  result=base;
  for(i=1;i<exp;i++)
 	{
  	 result=result*base;
   }
  return result;
 }