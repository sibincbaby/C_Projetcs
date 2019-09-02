#include <stdio.h>
#include <string.h>
int main()
{
  int k=0,i=0;
  char str[100],st[25]={0};
  gets(str);
  
   while(str[i]!='\0')
  {
   k=str[i]-97;
   st[k]=st[k]+1;
   i++;
  }
   for(i=0;i<=25;i++)
   {
           if(st[i]>0)
     {
      printf("%c%d ",i+97,st[i]);
     }  
   
   }          
   return 0;      
}