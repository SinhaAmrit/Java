/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Calculate The Area Of A Square.
*/
import java.util.*;
class AreaOfSquare
{
    public static void main(String args[])
    {
        int side, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of the sides of square");
        side = sc.nextInt();
        area = side * side;
        System.out.println("Area of Square : " + area);
    }
}
