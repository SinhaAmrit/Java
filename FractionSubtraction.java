/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Perform Fractional Subtraction.
*/
import java.util.*;
class FractionSubtraction
{
 public static void main(String args[])
 {
  float a,b,c,d;
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a : ");
  a = scanner.nextFloat();
  System.out.print("Enter b : ");
  b = scanner.nextFloat();
  System.out.print("Enter c : ");
  c = scanner.nextFloat();
  System.out.print("Enter d : ");
  d = scanner.nextFloat();
  // fraction addition formula ((a*d)-(b*c))/(b*d)
  System.out.print("Fraction subtraction : [( "+a+" * "+d+" )-( "+b+" * "+c+" ) / ( "+b+" * "+d+" )] = "+(((a*d)-(b*c))/(b*d)));
 }
}
