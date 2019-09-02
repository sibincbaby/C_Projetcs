#include<stdio.h>
int main()
{
    int count=1,n;
    scanf("%d",&n);
	for(int row_no = n ; row_no >= 1 ; row_no--)
      {
		for(int space = 1 ; space <= (row_no - 1) ; space++ ) 
          {
			 printf(" ");
		  }
		  
		  int odd=(2*count)-1;
		  //printf("odd=%d",odd);
		for(int col_no = 1 ; col_no <= odd ; col_no++)
          {
			 printf("*");
			 
			 
		  }
    	printf("\n");
    	count=count+1;
	  }	
    return 0;
}