# include <stdio.h>
# include <string.h>
# include <stdlib.h>
int main()
{
int i,j,flag=0,temp=0;
char str[100];
gets(str);
char str2[100];
gets(str2);
int len=strlen(str);


for(j=0;j<len;j++)
{


temp=str[0];
for(i=1;i<len;i++)
{
str[i-1]=str[i];
}
str[len-1]=temp;
//  printf("%s  %s hello\n",str,str2);
if(strcmp(str,str2)==0)
{
flag=1;
break;
}
}
if(flag==1)
printf("Yes");
else
printf("No");



  
  
	return 0;
}