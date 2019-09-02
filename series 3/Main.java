#include<stdio.h>
#include<math.h>
int main()
{
 int n,i,sum=0;
  int a=1;
      int b=2;
      
       
      
  scanf("%d",&n);
  if(n==1)
       sum=a;
       else if(n==2)
       sum=b;
  for(i=2;i<n;i++)
  {
    
    sum=a+b;
 a=b;
    b=sum;
    
    
   }
  printf("%d",sum);
  
}