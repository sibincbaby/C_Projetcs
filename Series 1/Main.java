#include<stdio.h>
#include<math.h>
int main()
{
 int n,res,p;
  scanf("%d",&n);
  if(n%2==1)
  {
    res=pow(2,(n/2));
    printf("%d",res);
   }
  else
  {
    res=pow(3,((n/2)-1));
    printf("%d",res);
  }
}