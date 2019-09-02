#include<stdio.h>
#include<string.h>
int main()
{
    char str1[100];
  gets(str1);
  int i;
 int len=strlen(str1);
  for(i=len-1;i>=0;i--)
  {
    if(str1[i]==' ')
    {
      
      printf("%s ",&str1[i+1]);
      str1[i]='\0';
      }
   
  } 
  printf("%s",str1);
  return 0;
}