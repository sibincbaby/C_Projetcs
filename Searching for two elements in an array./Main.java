#include<stdio.h>
int main()
{
  int i,num1,size,flag1=0,flag=0,num2,res1,res2;
   scanf("%d",&size);
  int arr[size];
  
 for(i=0;i<size;i++)
  { 
  scanf("%d",&arr[i]);
 }
    
    
    
  scanf("%d%d",&num1,&num2);
  
 for(i=0;i<size;i++)
  {
     //printf("value of i =%d",i);
    if(arr[i]==num1) 
    {
   // res1=i;
      flag1=1;
      printf("%d\n",i);
     
    }
   else if(arr[i]==num2)
   {
      flag=1;
      printf("%d",i);
  }
  
 }
  if((flag1==0)||(flag==0))
     printf("-1");
  return 0;
}