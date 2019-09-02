#include<stdio.h>
int main()
{
    int n;
    
    scanf("%d",&n);
    int count=n;
	for(int row_no = 1 ; row_no <= n ; row_no++)
      {
		for(int space = 1 ; space <= (row_no - 1) ; space++ ) 
          {
			 printf("");
		  }
		  
		  //int odd=(2*count)-1;
		  //printf("odd=%d",odd);
		for(int col_no = count ; col_no >= 1 ; col_no--)
          {
			 printf("%d",col_no);
			 
			 
		  }
    	printf("\n");
    	count=count-1;
	  }	
    return 0;
}