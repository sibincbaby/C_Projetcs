#include <stdio.h>
int main() {
	
  int i,j,num,first_num,last_num=0;
 scanf("%d",&num);
  
  for(i=1;i<=num;i++)
  {
    	for(j=1;j<=num;j++)
    	
    	{
          if(((i%2)!=0) && (j!=num))
          {
              
          printf("%d",i);
          }
        
          else if(((i%2)!=0) &&(j==num))
          {
            //printf("hii");
            last_num=i+1;
            printf("%d",last_num);
            //printf("\n");
            first_num=last_num+1;
            //printf("%d",first_num);
          }
          
          
          if(((i%2)==0) && (j!=1))
          {
              
          printf("%d",i);
          }
          
          
          if(((i%2)==0) && (j==1))
          {
              
           printf("%d",first_num);
          }
         
        
          
          
        }
    
   printf("\n");   
      
  }
  
  

  return 0;
}