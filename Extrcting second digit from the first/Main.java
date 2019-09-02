#include<stdio.h>
int main() {
  int num,snum=0,d;
	scanf("%d",&num);
    while(num>10)
    {
     
     snum=num%10;
     //printf("%d",snum);
  	 num=num/10;
      

    }
  printf("%d",snum);
  		
	return 0;
}
