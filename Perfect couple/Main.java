#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  int i,j,num1,num2,flag=0;
  
   for(i=0; i<size-1; i++)
    {
     //printf("%d %d  %d\n",arr[i],arr[i+1],arr[i]+arr[i+1]);
      for(j=i; j<size; j++)
      {
         //printf("value of arr[i]= %d ",arr[i]);
          //printf("value of arr[j]= %d\n",arr[j]);
        if(arr[i]+arr[j]==sum)
        {
         // printf("value of arr[i]= %d",arr[i]);
         // printf("value of arr[j]= %d\n",arr[j]);
       //printf("Perfect couple");
         flag=1;
         num1=arr[i];
         num2=arr[j];
         break;
         }
       }
     
     }
  if (flag==1)
  printf("Perfect couple: %d %d",num1,num2);
  else
  printf("No perfect couple found!");
  }