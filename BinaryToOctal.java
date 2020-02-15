/**
* @author : Amrit Sinha
* Date : February 15,2020
* GitHub : /SinhaAmrit
* CodePen : /SinhaAmrit
* Facebook : /codiizone
* Instagram : /codiizone
* website : https://codiizone.blogspot.com/
* Java Program To Convert Binary To Octal.
*/
import java.io.*;
class BinaryToOctal
{
    public static void main(String[] args) throws Exception
    {
        String num = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter binary number : ");
        num = br.readLine();
        int dec = Integer.parseInt(num, 2);
        String oct = Integer.toOctalString(dec);
        System.out.println("Binary " + num + " in Octal is " + oct);

    }
}
