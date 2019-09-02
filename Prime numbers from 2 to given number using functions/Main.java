#include<stdio.h>
int prime(int);
int main()
{
  int a;
  scanf("%d",&a);
   prime(a);
    return 0;
}
int prime(int num)
{
  int count=0,i,k;
   for (i=2;i<=num;i++)
   { 
     for(k=1;k<=i/2;k++)
     {
       //printf("value of i = %d value of k = %d\n",i,k);
       if(i%k==0)
        
       {
         count=count+1;
         //printf("value of count %d\n",count);
         
       }
       
     }if (count<2)
       {
         //printf("hoiiin");
         printf("%d\n",i);
         
       }
   count=0;
         
     
   }
  
  
}
