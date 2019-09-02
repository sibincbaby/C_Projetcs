#include <stdio.h>
int main() {
  int num,sum,d;
	scanf("%d",&num);
    while(num!=0)
    {
      d=num%10;
  num=num/10;
      sum=sum+d;
    }
  printf("%d",sum);
  		
	return 0;
}