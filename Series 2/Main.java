#include<stdio.h>
#include<math.h>
int main()
{
 int n,res,p;
  scanf("%d",&n);
  if(n%2==1)
  {
    printf("%d",n-1);
   }
  else
  {
    printf("%d",(n/2)-1);
  }
}