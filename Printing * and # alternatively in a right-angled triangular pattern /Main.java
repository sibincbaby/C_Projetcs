/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
int
main ()
{
  int count,flag=0,num, i, k;
  scanf("%d",&num);
  for (i = 1; i <= num; i++)
    {
      for (k = 1; k <= i; k++)
	{

        if(flag==0)
        {
	  printf ("*");
	  flag=1;
        }
        else
        {
	  printf ("#");
	  flag=0;
        }

	}

      printf ("\n");
    }



  return 0;
}
