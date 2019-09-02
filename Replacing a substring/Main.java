#include<stdio.h>
#include<string.h>
int main()
{
  char str1[100],str2[100],str3[100];
  gets(str1);
  gets(str2);
  gets(str3);
  int i,j,index;
  int len1=strlen(str1);
   int len2=strlen(str2);
   int len3=strlen(str3);
  
  for(i=0;i<len1;i++)
  {
    index=i;
    if(str1[i]==str2[0])
    {
      for(j=1;j<len2;j++)
      {
        if(str1[i+j]!=str2[j])
        {
          index=-1;
  			break;
        }
      
    }
    if(index!=-1)
    {
      str1[index]='\0';
      break;
    }
    }
}
  printf("%s%s%s",str1,str3,&str1[index+len2]);
  return 0;
}