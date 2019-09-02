#include<stdio.h>
#include<string.h>
int main()
{ 
  int key;
   char string[100];
    gets(string);
  scanf("%d",&key);
  key=key%26;
  
   int str_len = strlen(string);
   for(int i = 0; i < str_len; i++)
   {
     int a=string[i]-key;
         if((string[i]>64)&&(string[i]<91))
         {
            if(a<65)
            {
            a=a+26;
            }
         }
         else if((string[i]>96)&&(string[i]<123))
         {
            if(a<97)
            {
            a=a+26;
            }
         }
         if(string[i]==32)
         printf(" "); 
         else
          printf("%c",a);
        }
  return 0;
}