import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      String str1 = obj.nextLine();
      String str2 = obj.nextLine();
      int parts = obj.nextInt();
      str1=str2;
      //System.out.println(str1);
      int len = str1.length();
      //System.out.println(len);
      int i=0;
      for(i=0;i<len;i++)
      {
         char a = str1.charAt(i);
         System.out.print(a);
        if(a == ' ')
           System.out.println();

      }
      
    }
}
      
      