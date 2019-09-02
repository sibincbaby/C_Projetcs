#include <stdio.h>
int main() {
	int i,l,rnum,num,sum=0,fact=1;
  scanf("%d",&num);
  rnum=num;
  
  while(num!=0)
  {
      l=num%10;
      num=num/10;
      //printf("\nthe digit is %d",l);
      
      
    
    for(i=1;i<=l;i++)
{
  fact=fact*i;
  
  
}
     sum=sum+fact;
   
     
     //printf("\nfacts are %d",fact);
    
      fact=1;
    
     
  }
  //printf("\n%d",sum);
  if(sum==rnum)
  printf("Yes",sum);
  else
  printf("No");
  
  
	return 0;
}