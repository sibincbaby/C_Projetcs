#include<stdio.h>
int main()
{
  int i,large,size;
   scanf("%d",&size);
  int arr[size];
  
 for(i=0;i<size;i++)
  { 
  scanf("%d",&arr[i]);
 }
  large=arr[0];
 for(i=0;i<size;i++)
  {
    
    if(arr[i]>large)
    {
      
      large=arr[i];
    }
 }
  printf("%d",large);
  return 0;
}