#include<stdio.h>
int main()
{
        int n,i,j,k;
        scanf("%d",&n);
        int arr[n];
  		scanf("%d",&k);
  		int arr2[10]={0};
  
        for(int i = 0; i <= n - 1; i++)
        {
            scanf("%d",&arr[i]);
        }

  for(int i = 0; i <= n - 1; i++)
  {
    	 for(int j =1; j <= k; j++)
        {
    		if(arr[i]==j)
              arr2[j]++;
              
        }
  }
  
    for(int j =1; j <= k; j++)
        {
    		printf("%d %d\n",j,arr2[j]);
  		 }
}