#include<stdio.h>
int main()
{
  int l,ly,lyy,year;
  scanf("%d",&year);
  l=year%4;
  ly=year%400;
  lyy=year%100;
  if(l==0)
  {
    if(lyy=0 && ly!=0)
    
    printf("Not Leap Year");
  	else 
      printf("Leap year");
  }   
 
 else
    printf("Not Leap year");
}