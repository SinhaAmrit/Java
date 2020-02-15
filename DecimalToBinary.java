/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Convert Decimal To Binary.
*/
import java.util.Scanner;
class DecimalToBinary
{
    public String toBinary(int n)
    {
        if (n == 0)
        {
            return "0";
        }
        String binary = "";
        while (n > 0)
        {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return binary;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int decimal = scanner.nextInt();
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String binary = decimalToBinary.toBinary(decimal);
        System.out.println("The binary representation is " + binary);
    }
}
