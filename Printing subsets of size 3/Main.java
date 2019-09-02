#include<stdio.h>
void subset(int arr[], int size);
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
  	
    subset(arr,size);
    return 0;
}


void subset(int arr[],int size)
{
  int i,k,j;
 for(i=0;i<=size-1;i++)
 {
   for(j=i+1;j<size;j++)
   {
     for(k=j+1;k<size;k++)
     {
       		printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
     }
   }
   if(i!=2)
   printf("\n");
 }
}