
  
#include<stdio.h>
int main()
{
    int arr_size,sum=0;
    scanf("%d", &arr_size);
    int arr[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
        scanf("%d", &arr[index]);
    }
    int seq[2 * arr_size];
    int seq_idx = 0;
    int start_idx = 0;
int maxsum=0;

    for(int index = 0 ; index < arr_size; index++)
    {
        if((arr[index] > arr[index - 1])||(index==0))
        {
            sum=sum+arr[index];
            if(sum>maxsum)
            {
            maxsum=sum;
            }
           // printf("\nmax sum value = %d\n ",maxsum);
        }
        else
        {
            if(sum>maxsum)
            {
            maxsum=sum;
            }sum=0;
            sum=sum+arr[index];
            if(sum>maxsum){
            maxsum=sum;}
            //printf("\n%d ",arr[index]);
        }
    } 
 printf("%d ",maxsum);

   return 0;
}