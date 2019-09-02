import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int j,i,c=0;
      int opt = obj.nextInt();
double result=0.0;
      int side1=0,side2=0;
      switch(opt)
      {
        case 1:side1 = obj.nextInt();
          		side2 = obj.nextInt();
          		result = (int)side1*side2;
         		break;
          case 2:side1 = obj.nextInt();
          		side2 = obj.nextInt();
          		result = side1*side2;
         		break;
          case 3:side1 = obj.nextInt();
          		side2 = obj.nextInt();
          		result = 0.5*(side1*side2);
         		break;
          case 4:side1 = obj.nextInt();
          		result =3.1399999999999999*(side1*side1);
              
         		break;
        default:System.out.println("Invalid option");
          }
 System.out.println(result);
    }
}