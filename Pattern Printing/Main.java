import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int j,i,c=0;
      int row = obj.nextInt();
      int col = obj.nextInt();
      for(i=row;i>0;i--)
      {
        for(j=row;j>0;j--)
        {
        if(i<=j)
             System.out.print(j);
            else
            System.out.print(i);
          }
          System.out.println("");
      }
     
    }     
 }