import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int base = obj.nextInt();
      int exp = obj.nextInt();
      System.out.println(Math.pow(base,exp));
      
    }
}