#include<stdio.h>
int main()
{
    int n,num=1,count=0;
    scanf("%d",&n);
    
	for(int row_no = n ; row_no >= 1 ; row_no--)
      {
		for(int space = 1 ; space <= (row_no - 1) ; space++ ) 
          {
			 printf(" ");
		  }
		  
		  if(count<n)
		  {
		for(int col_no = 1 ; col_no <= (n-(row_no - 1)) ; col_no++)
          {
			 //printf("* ");
			 printf("%d ",num);
			 num=num+1;
		  }
    	printf("\n");
    	count=count+1;
	  }	}
    return 0;
}