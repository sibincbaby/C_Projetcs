#include<stdio.h>
#include<string.h>
int main()
{
  char str1[100],str2[100];
  gets(str1);
  gets(str2);
       int len1,len2;
       len1=strlen(str1);
       len2=strlen(str2);
       int len=len1-len2;
       int i,j,count1=0,count2=0;
       
 for(i=0;i<=len;i++)
    {
   count1=0;
       for(j=0;j<=len2;j++)
       {
         
         if((str1[j+i]==str2[j])|| (str1[j+i]+32 == str2[j]) || (str1[j+i]-32==str2[j]))
         { 
         //printf("%c %c\n ",str1[j+i],str2[j]);
                  count1++;
         //printf("\n%d",count1);
         //printf(" count1 %d\n",count1);
         }
       }
   //printf("%d\n",count1);
    if(count1>=len2)
      { 
        // printf("helo");
         count2++; 
        }
   		count1=0;
  }
  //printf("\n%d",len2);
printf("%d",count2);
return 0;
}