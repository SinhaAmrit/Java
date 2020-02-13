/**
* @author : Amrit Sinha
* Date : February 12,2020
* GitHub : SinhaAmrit
* Facebook : /codiizone
* Instagram : @codiizone
* wesite : https://codiizone.blogspot.com/
* Java Program to Accept Radius And Print The Area Of The Circle
*/
import java.util.Scanner;
class CircleArea{
    public static void main(String ...args){
        System.out.println("Enter The Radius Of The Circle!");
        Scanner kb=new Scanner(System.in);
        int r=kb.nextInt();
        System.out.println("Area Of The Circle Is "+((float)Math.PI*r*r)+" Units When Radius Is "+r+" Units");
    }
}
Jo
