#include <stdio.h>
int gcd(int,int);
int main() 
{
  int gc,a,b,gc2,c;
  scanf("%d%d%d",&a,&b,&c);
  gc=gcd(a,b);
  gc2=gcd(gc,c);
  
  printf("%d",gc2);
	return 0;
}
int gcd(int num1,int num2)
{
  int i,k,div1,div2;
 	if(num1<num2)
    {
     i=num1; 
    }
  else
    i=num2;
  
  for(k=i;k>0;k--)
  {
   div1=num1%k;
    div2=num2%k;
    if((div1==0)&& (div2==0))
    {
      return k;
    break;
    }
  }
  
}
