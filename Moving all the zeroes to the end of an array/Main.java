#include<stdio.h>
//void rotate(int,int,int);
int main()
{
  int i,num,j,temp;
  scanf("%d",&num);
  
  int arr[num];
  for(i=0;i<num;i++)
  {
    scanf("%d",&arr[i]);
   }

  arrange(num,arr);
  for(i=0;i<num;i++)
  {
    printf("%d ",arr[i]);
   }
}
////////////////////////////////////////////
void arrange(int num,int arr[])
{
  int i,k=0,j=0;
  for(i=0;i<num;i++)
  {
    if(arr[i]!=0)
    {
      arr[j]=arr[i];
     // printf("j= %d\n ",arr[j]);
      
      j++;
    }
  }
  // printf("after value j j= %d\n ",j);
   //printf("value at 8th =%d \n",arr[7]);
  for(i=j;i<num;i++)
  {
    arr[i]=0;
    
   // printf("value after non zero th =%d \n",arr[j);
    
  }
   
}