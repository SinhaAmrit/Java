/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Calculate Simple And Compound Interest.
*/
import java.lang.*;
import java.util.Scanner;
class CalculateInterest
{
    public static void main(String[] args)
    {
        double p, n, r, si, ci;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        p = s.nextDouble();
        System.out.print("Enter the No.of years : ");
        n = s.nextDouble();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();
        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;
        System.out.println("\nAmount : " + p);
        System.out.println("No. of years : " + n);
        System.out.println("Rate of interest : " + r);
        System.out.println("Simple Interest : " + si);
        System.out.println("Compound Interest : " + ci);
    }
}
