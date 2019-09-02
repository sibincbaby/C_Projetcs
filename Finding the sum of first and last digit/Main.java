#include <stdio.h>
int main() {
  int num,fnum,snum,sum,d;
	scanf("%d",&num);
  fnum=num%10;
    while(num!=0)
    {
     
     snum=num%10; 
  	 num=num/10;
      sum=snum+fnum;
      

    }
  
  printf("%d",sum);
  		
	return 0;
}