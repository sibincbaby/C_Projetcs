#include<stdio.h>
//int insertion_sort(int n,int arr[]);
int main()
{
    int n;
	scanf("%d",&n);
    int arr[n];
    for(int i= 0;i < n; i++)
    {
        scanf("%d",&arr[i]);   
    }
  int temp=0;
  //////////////////////////////
  for(int i= 0;i < n; i++)
  {
    //printf("i value= %d\n",i);
    for(int j= 1;j < n; j++)
    {
      if((arr[i]<arr[j]))//&&(arr[j]>temp))
      {
        printf("%d,%d\n",arr[i],arr[j]);
     temp=arr[j];
      }
    }
  }
    
  
  
   // insertion_sort(n,arr);
    return 0;
} 