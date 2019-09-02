#include <stdio.h>
int main() 
{
	int rnum,i,l=0,q=1,num,sum=0,count=0;
	
	
  scanf("%d",&num);
  rnum=num;
  while(num!=0)
  {
      l=num%10;
      //printf("\n%d",l);
      count=count+1;
    
    
    
    //printf("\n%d",sum);
    
    num=num/10;
     
  }
  
  //printf("\ncount is  %d",count);
  num=rnum;
  
  
  while(num!=0)
  {
      l=num%10;
      //printf("\n%d",l);
      q=pow(l,count);
    
    
    sum=sum+q;
    //printf("\npower of num%d",q);
    
    num=num/10;
     
  }
 
  
 if(rnum==sum)
 printf("Armstrong Number");
 else
printf("Not an Armstrong Number");
//printf("\nhello%d",sum);
	return 0;
}