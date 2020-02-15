/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Convert Binary To Decimal.
*/
import java.io.*;
class BinaryToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Binary no. to convert in Decimal : ");
        String number = br.readLine();             
        /*
          to convert Binary number to decimal number use,
          int parseInt method of Integer wrapper clas       
          Pass 2 as redix second argument.
         */
        int decimalNumber = Integer.parseInt(number, 2);
        System.out.println("Binary number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);
    }
}
