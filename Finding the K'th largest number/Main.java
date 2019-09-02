#include<stdio.h>
//void sort(int,int);

int main()
{
        int n;
        scanf("%d",&n);
        int arr[20];
        for(int i = 0; i <= n - 1; i++)
        {
            scanf("%d",&arr[i]);
        }
        int k;
        scanf("%d",&k);

        sort(n,arr);
        printf("%d",arr[n-k]);

    return 0;
}
void sort(int n,int arr[])
{
  int temp,i=0,j=0;
  temp= arr[i];
  int a;
 for (i = 0; i < n; ++i) 
        {
 			 for (j = i + 1; j < n; ++j)
            {
              if (arr[i] > arr[j]) 
                {
 					a =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
    }
}