#include <stdio.h>
int great(int,int,int);
int main()
{

  int larg,a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  larg=great(a,b,c);
  printf("%d",larg);
  
  	return 0;
}
int great(int num1,int num2,int num3)
{
 int l,large;
  if(num1>num2)
    l=num1;
    else
      l=num2;
      
      if(l>num3)
        large=1;
  else
  {
    large=num3;
  return large;
  }
  
}