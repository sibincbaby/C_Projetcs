#include<stdio.h>
int main()
{
 int i,j,n[1000],l,flag;
 scanf("%d",&l);
 for(i=1;i<l;i++)
  {
   scanf("%d",&n[i]);
  }
for(i=1;i<l;i++)
  {
  	for(j=1;j<l;j++)
  	{
          if(n[i]==j)
          {  flag=1;
          	break;
          }
          else
            flag=j;
      }
 }
  printf("%d",flag);
 return 0;
}