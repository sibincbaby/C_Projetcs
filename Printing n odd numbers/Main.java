#include <stdio.h>
int main() {
	int i,num;
  scanf("%d",&num);
  for(i=1;i<=2*num-1;i++)
  {
    if(i%2==1)
    printf("%d\n",i);
   
  }
	return 0;
}