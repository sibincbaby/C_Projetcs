#include <stdio.h>
int main() {
	int count,num,i;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
    printf("%d",i);
    count=count+1;
    if(count%3==0)
    {printf(",");
    count=0;
    } 
  }
    
	return 0;
}